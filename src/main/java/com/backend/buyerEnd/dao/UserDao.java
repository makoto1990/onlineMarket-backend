package main.java.com.backend.buyerEnd.dao;

import main.java.com.backend.buyerEnd.model.User;
import java.util.*;
import java.sql.*;
import java.sql.Date;

public class UserDao {
	public UserDao(){}
//	public List<User> listUser(){
//		
//	}
//	public User getUserByUserID(String userId){
//		
//	}
//	public String nameToID(String username){
//		String userid = null;
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
//			String sql = "select * from [user] where userName='"+username+"'";
//			psmt = con.prepareStatement(sql);
//			rs = psmt.executeQuery();
//			while(rs.next()){
//				userid = rs.getString("userID");
//			}
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
//		return userid;
//	}
	public List<User> getUserByUserName(String username){
		List<User> list = new ArrayList<User>();
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			con = DriverManager.getConnection("jdbc:sqlserver://123.206.116.122:1433;DatabaseName=onlineMarket","sa","ECUSTJ143@software");
			String sql = "select * from [user] where userName='"+username+"'";
			psmt = con.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()){
				String userID = rs.getString("userID");
				Date registerDate = rs.getDate("registerDate");
				String password = rs.getString("password");
				String realName = rs.getString("realName");
				String IDnumber = rs.getString("IDnumber");
		    	String Phone = rs.getString("Phone");
		    	String userStatus = rs.getString("userStatus");
		    	String Postcode = rs.getString("Postcode");
		    	String Province = rs.getString("Province");
		    	String City = rs.getString("City");
		    	String District = rs.getString("District");
		    	String Street = rs.getString("Street");
		    	String Address = rs.getString("Address");
		    	int isManager = rs.getInt("isManager");
				User u1 = new User(userID,registerDate,username,password,realName,IDnumber,
						Phone,userStatus,Postcode,Province,City,District,Street,Address,isManager);
				list.add(u1);
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
	public void alterUser(User user){
		Connection con = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;
		try{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		try{
			con = DriverManager.getConnection("jdbc:sqlserver://123.206.116.122:1433;DatabaseName=onlineMarket","sa","ECUSTJ143@software");
			String sql = "update [user] set (userID,reqisterDate,userName,password,realName,IDnumber,Phone,userStatus,Postcode,"
					+ "Province,City,District,Street,Address,isManager) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			psmt = con.prepareStatement(sql);
			psmt.setString(1, user.getuserID());
			psmt.setDate(2, user.getregisterDate());
			psmt.setString(3, user.getuserName());
			psmt.setString(4, user.getpassword());
			psmt.setString(5, user.getrealName());
			psmt.setString(6, user.getIDnumber());
			psmt.setString(7, user.getPhone());
			psmt.setString(8, user.getuserStatus());
			psmt.setString(9, user.getPostcode());
			psmt.setString(10, user.getProvince());
			psmt.setString(11, user.getCity());
			psmt.setString(12, user.getDistrict());
			psmt.setString(13, user.getStreet());
			psmt.setString(14, user.getAddress());
			psmt.setInt(15, user.getisManager());
			
			psmt.executeQuery();	
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
	}
//	public void removeUser(String userId){
//		
//	}
}
