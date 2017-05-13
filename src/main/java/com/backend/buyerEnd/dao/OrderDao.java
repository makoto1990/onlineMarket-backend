package main.java.com.backend.buyerEnd.dao;

import main.java.com.backend.buyerEnd.model.Order;
import main.java.com.backend.buyerEnd.dao.UserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class OrderDao {
	public List<Order> getOrderByUserID(String username){
		List<Order> list = new ArrayList<Order>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String userid = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			con = DriverManager.getConnection("jdbc:sqlserver://123.206.116.122:1433;DatabaseName=onlineMarket","sa","ECUSTJ143@software");
			//先将username转换为userid
			String sql = "select userID from [user] where userName='"+username+"'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){ userid = rs.getString("userID");}
			
			sql = "select * from [Order] where userID='"+userid+"'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				String orderID = rs.getString("orderID");
				String receiverName = rs.getString("receiverName");
			    String Phone = rs.getString("Phone");
			    String orderStatus = rs.getString("orderStatus");
			    String payTime = rs.getString("payTime");
			    String Postcode = rs.getString("Postcode");
			    String deliveryTime = rs.getString("deliveryTime");
			    String confirmTime = rs.getString("confirmTime");
			    String Province = rs.getString("Province");
			    String City = rs.getString("City");
			    String District = rs.getString("District");
			    String Street = rs.getString("Street");
			    String Address = rs.getString("Address");
			    String creatTime = rs.getString("creatTime");
			    String sellerID = rs.getString("sellerID");
			    float shipCost = rs.getFloat("shipCost");
			    float allPrice = rs.getFloat("allPrice");
				Order o1 = new Order(orderID,receiverName,Phone,orderStatus,payTime,deliveryTime,
						confirmTime,Postcode,Province,City,District,Street,Address,creatTime,
						userid,sellerID,shipCost,allPrice);
				list.add(o1);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null) rs.close();
				if(psmt!=null) psmt.close();
				if(con!=null) con.close();	
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	public List<Order> quick_getOrderByUserID(String username){
		List<Order> list = new ArrayList<Order>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		String userid = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			con = DriverManager.getConnection("jdbc:sqlserver://123.206.116.122:1433;DatabaseName=onlineMarket","sa","ECUSTJ143@software");
			//先将username转换为userid
			String sql = "select * from [user] where userName='"+username+"'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){ 
				userid = rs.getString("userID");
			}

			sql = "select * from [Order] where userID='"+userid+"'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				String orderID = rs.getString("orderID");
			    String orderStatus = rs.getString("orderStatus");
			    String payTime = rs.getString("payTime");
			    String deliveryTime = rs.getString("deliveryTime");
			    String confirmTime = rs.getString("confirmTime");
			    String creatTime = rs.getString("creatTime");
				Order o1 = new Order(orderID,orderStatus,payTime,deliveryTime,confirmTime,creatTime,userid);
				list.add(o1);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try {
				if(rs!=null) rs.close();
				if(psmt!=null) psmt.close();
				if(con!=null) con.close();	
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}
//	public void insertNewOrder(Order order){
//		Connection con = null;
//		PreparedStatement psmt = null;
//		ResultSet rs = null;
//		try{
//			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//		}catch(ClassNotFoundException e){
//			e.printStackTrace();
//		}
//		
//		try{
//			con = DriverManager.getConnection("jdbc:sqlserver://123.206.116.122:1433;DatabaseName=onlineMarket","sa","ECUSTJ143@software");
//			String sql = "insert into [Order](orderID,receiveName,Phone,orderStatus,payTime,deliveryTime,shipCost,"
//					+ "allPrice,confirmTime,Postcode,Province,City,District,Street,Address,creatTime,userID,sellerID)"
//					+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//			psmt = con.prepareStatement(sql);
//			psmt.setString(1, order.getorderID());
//			psmt.setString(2, order.getreceiverName());
//			psmt.setString(3, order.getPhone());
//			psmt.setString(4, order.getorderStatus());
//			psmt.setString(5, order.getpayTime());
//			psmt.setString(6, order.getdeliveryTime());
//			psmt.setDouble(7, order.getshipCost());
//			psmt.setDouble(8, order.getallPrice());
//			psmt.setString(9, order.getconfirmTime());
//			psmt.setString(10, order.getPostcode());
//			psmt.setString(11, order.getProvince());
//			psmt.setString(12, order.getCity());
//			psmt.setString(13, order.getDistrict());
//			psmt.setString(14, order.getStreet());
//			psmt.setString(15, order.getAddress());
//			psmt.setString(16, order.getcreatTime());
//			psmt.setString(17, order.getuserID());
//			psmt.setString(18, order.getsellerID());
//			
//			psmt.executeQuery();
//		}catch(SQLException e){
//			e.printStackTrace();
//		}finally{
//			try {
//				if(rs!=null) rs.close();
//				if(psmt!=null) psmt.close();
//				if(con!=null) con.close();	
//			}catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
