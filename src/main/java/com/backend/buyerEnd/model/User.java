package main.java.com.backend.buyerEnd.model;

import java.sql.Date;

public class User {
	private String userID;//用户编号
	private Date registerDate;//注册时间
	private String userName;//用户昵称
	private String password;//用户密码
	private String realName;//真实姓名
	private String IDnumber;//身份证号
	private String Phone;//联系电话
	private String userStatus;//用户状态
	private String Postcode;//邮编
	private String Province;//省份
	private String City;//城市
	private String District;//区县
	private String Street;//街道
	private String Address;//详细地址
	private int isManager;//是否是管理员
	
	public void setuserID(String userID)
	{
		this.userID=userID;
	}
	public void setregisterDate(Date registerDate)
	{
		this.registerDate=registerDate;
	}
	public void setuserName(String userName)
	{
		this.userName=userName;
	}
	public void setpassword(String password)
	{
		this.password=password;
	}
	public void setrealName(String realName)
	{
		this.realName=realName;
	}
	public void setIDnumber(String IDnumber)
	{
		this.IDnumber=IDnumber;
	}
	public void setPhone(String Phone)
	{
		this.Phone=Phone;
	}
	public void setuserStatus(String userStatus)
	{
		this.userStatus=userStatus;
	}
	public void setuPostcode(String Postcode)
	{
		this.Postcode=Postcode;
	}
	public void setProvince(String Province)
	{
		this.Province=Province;
	}
	public void setCity(String City)
	{
		this.City=City;
	}
	public void setDistrict(String District)
	{
		this.District=District;
	}
	public void setStreet(String Street)
	{
		this.Street=Street;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public void setisManager(int isManager)
	{
		this.isManager=isManager;
	}
	
    public String getuserID()
    {
    	return this.userID;
    }
    public Date getregisterDate()
    {
    	return this.registerDate;
    }
    public String getuserName()
    {
    	return this.userName;
    }
    public String getpassword()
    {
    	return this.password;
    }
    public String getrealName()
    {
    	return this.realName;
    }
    public String getIDnumber()
    {
    	return this.IDnumber;
    }
    public String getPhone()
    {
    	return this.Phone;
    }
    public String getuserStatus()
    {
    	return this.userStatus;
    }
    public String getPostcode()
    {
    	return this.Postcode;
    }
    public String getProvince()
    {
    	return this.Province;
    }
    public String getCity()
    {
    	return this.City;
    }
    public String getDistrict()
    {
    	return this.District;
    }
    public String getStreet()
    {
    	return this.Street;
    }
    public String getAddress()
    {
    	return this.Address;
    }
    public int getisManager()
    {
    	return this.isManager;
    }
    
    public User(String userID,Date registerDate,String userName,String password,String realName,
    		String IDnumber,String Phone,String userStatus,String Postcode,String Province,
    		String City,String District,String Street,String Address,int isManager
    		){
    	super();
    	this.userID=userID;
    	this.registerDate=registerDate;
    	this.userName=userName;
    	this.password=password;
    	this.realName=realName;
    	this.IDnumber=IDnumber;
    	this.Phone=Phone;
    	this.userStatus=userStatus;
    	this.Postcode=Postcode;
    	this.Province=Province;
    	this.City=City;
    	this.District=District;
    	this.Street=Street;
    	this.Address=Address;
    	this.isManager=isManager;
    }
}