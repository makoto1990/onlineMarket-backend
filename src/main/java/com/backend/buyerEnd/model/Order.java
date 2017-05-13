package main.java.com.backend.buyerEnd.model;

public class Order {
     private String orderID;//订单编号
     private String receiverName;//收货人姓名
     private String Phone;//联系方式
     private String orderStatus;//订单状态
     private String payTime;//付款时间
     private String deliveryTime;//发货时间
     private String confirmTime;//确认/取消时间
     private String Postcode;//邮编
     private String Province;//省份
     private String City;//城市
     private String District;//区县
     private String Street;//街道
     private String Address;//详细地址
     private String creatTime;//创建时间
     private String userID;//用户编号
     private String sellerID;//卖家编号
     private float shipCost;//运费
     private float allPrice;//商品总价
     
     public void setorderID(String orderID)
     {
    	 this.orderID=orderID;
     }
     public void setreceiverName(String receiverName)
     {
    	 this.receiverName=receiverName;
     }
     public void setPhone(String Phone)
     {
    	 this.Phone=Phone;
     }
     public void setorderStatus(String orderStatus)
     {
    	 this.orderStatus=orderStatus;
     }
     public void setpayTime(String payTime)
     {
    	 this.payTime=payTime;
     }
     public void setdeliveryTime(String deliveryTime)
     {
    	 this.deliveryTime=deliveryTime;
     }
     public void setconfirmTime(String confirmTime)
     {
    	 this.confirmTime=confirmTime;
     }
     public void setPostcode(String Postcode)
     {
    	 this.Postcode=Postcode;
     }
     public void setProvince(String Province){
    	 this.Province=Province;
     }
     public void setCity(String City){
    	 this.City=City;
     }
     public void setDistrict(String District){
    	 this.District=District;
     }
     public void setStreet(String Street){
    	 this.Street=Street;
     }
     public void setAddress(String Address)
     {
    	 this.Address=Address;
     }
     public void setcreatTime(String creatTime)
     {
    	 this.creatTime=creatTime;
     }
     public void setuserID(String userID)
     {
    	 this.userID=userID;
     }
     public void setsellerID(String sellerID)
     {
    	 this.sellerID=sellerID;
     }
     public void setshipCost(float shipCost)
     {
    	 this.shipCost=shipCost;
     }
     public void setallPrice(float allPrice)
     {
    	 this.allPrice=allPrice;
     }
     
     public String getorderID()
     {
    	 return this.orderID;
     }
     public String getreceiverName()
     {
    	 return this.receiverName;
     }
     public String getPhone()
     {
    	 return this.Phone;
     }
     public String getorderStatus()
     {
    	 return this.orderStatus;
     }
     public String getpayTime()
     {
    	 return this.payTime;
     }
     public String getdeliveryTime()
     {
    	 return this.deliveryTime;
     }
     public String getconfirmTime()
     {
    	 return this.confirmTime;
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
     public String getcreatTime()
     {
    	 return this.creatTime;
     }
     public String getuserID()
     {
    	 return this.userID;
     }
     public String getsellerID()
     {
    	 return this.sellerID;
     }
     public float getshipCost()
     {
    	 return this.shipCost;
     }
     public float getallPrice()
     {
    	 return this.allPrice;
     }

     public Order(String orderID,String receiverName,String Phone,String orderStatus,String payTime,
    		 String deliveryTime,String confirmTime,String Postcode,String Province,String City,
    		 String District,String Street,String Address,String creatTime,String userID,
    		 String sellerID,float shipCost,float allPrice
    		 ){
    	 super();
    	 this.orderID=orderID;
         this.receiverName=receiverName;
         this.Phone=Phone;
         this.orderStatus=orderStatus;
         this.payTime=payTime;
         this.deliveryTime=deliveryTime;
         this.confirmTime=confirmTime;
         this.Postcode=Postcode;
         this.Province=Province;
         this.City=City;
         this.District=District;
         this.Street=Street;
         this.Address=Address;
         this.creatTime=creatTime;
         this.userID=userID;
         this.sellerID=sellerID;
         this.shipCost=shipCost;
         this.allPrice=allPrice;
     }
     public Order(String orderID,String orderStatus,String payTime,String deliveryTime,
    		 String confirmTime,String creatTime,String userID
    		 ){
    	 super();
    	 this.orderID=orderID;
         this.orderStatus=orderStatus;
         this.payTime=payTime;
         this.deliveryTime=deliveryTime;
         this.confirmTime=confirmTime;
         this.creatTime=creatTime;
         this.userID=userID;
     }

}