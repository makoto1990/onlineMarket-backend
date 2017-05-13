package main.java.com.backend.buyerEnd.search;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Hibernate;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import main.java.com.backend.buyerEnd.model.Goods;
import main.java.com.backend.defaultEnd.Dao;

public class SearchBean {
	public SearchBean(){
		super();
	}
	
	private ArrayList<Goods> allGoods=new ArrayList<>();
	private static ArrayList<String> allType=new ArrayList<>();
	private ArrayList<String> sellerName=new ArrayList<>();
	private int searchType;
	private String searchinfo;
	
	public void setSearchType(int searchType){
		this.searchType=searchType;
	}
	
	public void setSearchinfo(String searchinfo){
		this.searchinfo=searchinfo;
	}
	
	public int getSearchType(){
		return searchType;
	}
	
	public String getSearchinfo(){
		return searchinfo;
	}
	
	public ArrayList<String> getAllType() { 
    	
    	allType.clear();
        Configuration cfg = new Configuration().configure();       
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = null;  
        try{  
            session = factory.openSession();  
            //开启事务  
            session.beginTransaction();  
           
            SQLQuery query = session.createSQLQuery("select distinct goodsType as a from [onlineMarket].[dbo].[Goods]");
            
            query.addScalar("a", Hibernate.STRING);
            
        	for(Object item:query.list()){
            	String type=(String)item;
            	allType.add(type);	
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
        return allType;
    }  

	public ArrayList<Goods> loadAllGoods() {    
		String s=searchinfo;
    	allGoods.clear(); sellerName.clear();
        Configuration cfg = new Configuration().configure();       
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = null;  
        try{  
            session = factory.openSession();  
            //开启事务  
            session.beginTransaction();  
            
            String sql=null;
            if (searchType==1){
            	sql="select * from [onlineMarket].[dbo].[Goods] where goodsType like '%"+s+"%'";
            }else if(searchType==2){
            	sql="select * from [onlineMarket].[dbo].[Goods] where goodsName like '%"+s+"%'";
            }else if(searchType==0){
            	sql="select * from [onlineMarket].[dbo].[Goods] where goodsType like '%"+s+"%' or goodsName like '%"+s+"%'";
            }else sql="select * from [onlineMarket].[dbo].[Goods]";
           
            SQLQuery query = session.createSQLQuery(sql);
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
        session = null;  
        try{  
            session = factory.openSession();  
            //开启事务  
            session.beginTransaction();  
           
            SQLQuery query;
            for (int i=0;i<allGoods.size();i++){
            	Goods goods=allGoods.get(i);
            	query=session.createSQLQuery("select userName as a "
            								+ "from [onlineMarket].[dbo].[Seller] as b,[onlineMarket].[dbo].[User] as c"
            								+ " where b.userID=c.userID and b.sellerID='"+goods.getSellerID()+"'");
            	query.addScalar("a", Hibernate.STRING);
            	String sell=(String)query.uniqueResult();
            	sellerName.add(sell);
            	
            }     
            session.getTransaction().commit();         		       		
            //提交事务              
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
    
    public ArrayList<String> getsellerName(){
    	return sellerName;
    }
}
