package  com.backend.buyerEnd.dao;

import  com.backend.buyerEnd.model.User;
import java.util.*;
import java.sql.*;
import java.sql.Date;

public class UserDao {
	public UserDao(){}
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
			String sql = "update [User] set userName='"+user.getuserName()
										+"',password='"+user.getpassword()
										+"',realName='"+user.getrealName()
										+"',IDnumber='"+user.getIDnumber()
										+"',Phone='"+user.getPhone()
										+"',Postcode='"+user.getPostcode()
										+"',Province='"+user.getProvince()
										+"',City='"+user.getCity()
										+"',District='"+user.getDistrict()
										+"',Street='"+user.getStreet()
										+"',Address='"+user.getAddress()
										+"' where userID='"+user.getuserID()+"'";
			psmt = con.prepareStatement(sql);
			psmt.executeUpdate();

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
