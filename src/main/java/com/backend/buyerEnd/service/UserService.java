package main.java.com.backend.buyerEnd.service;

import main.java.com.backend.buyerEnd.model.User;

import java.util.ArrayList;
import org.hibernate.SQLQuery;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  

public class UserService {
	ArrayList<User> allUser = new ArrayList<>();
	public ArrayList<User> loadAllUser(){
		//读取配置文件
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = null;
		try{
			session = factory.openSession();
			session.beginTransaction();
			
			SQLQuery query = session.createSQLQuery("select * from [onlineMarket].[dbo].[User]");
			query.addEntity(User.class);
			
			for(Object item:query.list()){
				User user = (User)item;
				allUser.add(user);
			}
			
		}catch(Exception e){
			e.printStackTrace();
			//回滚
			session.getTransaction().rollback();
		}finally{
			if(session != null){
				if(session.isOpen()){
					session.close();
				}
			}
		}	
		return allUser;
	}
	public static void main(String[] argv){
    	UserService svc=new UserService();
    	svc.loadAllUser();
    }
}
