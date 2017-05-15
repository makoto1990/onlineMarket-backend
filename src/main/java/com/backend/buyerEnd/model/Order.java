package  com.backend.buyerEnd.model;

public class Order {
     private String orderID;//�������
     private String receiverName;//�ջ�������
     private String Phone;//��ϵ��ʽ
     private String orderStatus;//����״̬
     private String payTime;//����ʱ��
     private String deliveryTime;//����ʱ��
     private String confirmTime;//ȷ��/ȡ��ʱ��
     private String Postcode;//�ʱ�
     private String Province;//ʡ��
     private String City;//����
     private String District;//����
     private String Street;//�ֵ�
     private String Address;//��ϸ��ַ
     private String creatTime;//����ʱ��
     private String userID;//�û����
     private String sellerID;//���ұ��
     private float shipCost;//�˷�
     private float allPrice;//��Ʒ�ܼ�
     
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