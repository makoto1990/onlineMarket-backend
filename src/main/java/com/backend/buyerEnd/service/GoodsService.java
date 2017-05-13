package main.java.com.backend.buyerEnd.service;
import main.java.com.backend.buyerEnd.model.Goods;

import java.util.ArrayList;
import org.hibernate.SQLQuery;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  
  
public class GoodsService {  
	ArrayList<Goods> allGoods=new ArrayList<>();
    public ArrayList<Goods> loadAllGoods() {  
        //读取配置文件  
        Configuration cfg = new Configuration().configure();       
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = null;  
        try{  
            session = factory.openSession();  
            //开启事务  
            session.beginTransaction();  
           
            SQLQuery query = session.createSQLQuery("select * from [onlineMarket].[dbo].[Goods]");
            query.addEntity(Goods.class);           
            		       		
            for(Object item:query.list()){
            	Goods goods=(Goods)item;
            	allGoods.add(goods);
            }

            //提交事务  
            session.getTransaction().commit();  
            
        }catch(Exception e){  
            e.printStackTrace();  
            //回滚事务  
            session.getTransaction().rollback();  
        }finally{  
            if(session != null){  
                if(session.isOpen()){  
                    //关闭session  
                    session.close();  
                }  
            }  
        }  
        return allGoods;
    }  
    public static void main(String[] argv){
    	GoodsService svc=new GoodsService();
    	svc.loadAllGoods();
    }
}  