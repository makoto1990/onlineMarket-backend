package main.java.com.backend.buyerEnd.service;

import main.java.com.backend.buyerEnd.model.*;
import org.hibernate.SQLQuery;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  
  
public class DetailService {  
	
    public static Goods getGoodsByGoodsId(String goodsId){
    	Goods goods = null;
    	//读取配置文件  
        Configuration cfg = new Configuration().configure();       
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = null;  
        try{  

            session = factory.openSession();  
            session.beginTransaction();             
            SQLQuery query = session.createSQLQuery("select * from [onlineMarket].[dbo].[Goods] where goodsID='"+goodsId+"'");
            query.addEntity(Goods.class);                       		       		
            for(Object item:query.list())goods=(Goods)item;
            session.getTransaction().commit();  
         
        }catch(Exception e){  
            e.printStackTrace();
            session.getTransaction().rollback();  
        }finally{  
            if(session != null&&session.isOpen()){session.close();}    
        }  
        return goods;
    }
    
    public static Seller getSellerBySellerId(String sellerID){
    	Seller seller = null;
    	//读取配置文件  
        Configuration cfg = new Configuration().configure();       
        SessionFactory factory = cfg.buildSessionFactory();  
        Session session = null;  
        try{  

            session = factory.openSession();  
            session.beginTransaction();             
            SQLQuery query = session.createSQLQuery("select * from [onlineMarket].[dbo].[Seller] where sellerID='"+sellerID+"'");
            query.addEntity(Seller.class);                       		       		
            for(Object item:query.list())seller=(Seller)item;
            session.getTransaction().commit();  
         
        }catch(Exception e){  
            e.printStackTrace();
            session.getTransaction().rollback();  
        }finally{  
            if(session != null&&session.isOpen()){session.close();}    
        }  
        return seller;
    }
}  