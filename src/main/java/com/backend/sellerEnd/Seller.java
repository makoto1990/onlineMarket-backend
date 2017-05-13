package main.java.com.backend.sellerEnd;

public class Seller {
   private String sellerID; //锟斤拷锟揭憋拷锟�
   private String registerDate;  //注锟斤拷时锟斤拷
   private String userID;   //锟矫伙拷锟斤拷锟�
   private String sellerIntro;  //锟斤拷锟揭硷拷锟�
   void setSellerID(String sellerID)
   {
	   this.sellerID=sellerID;
   }
   void setRegisterDate(String registerDate)
   {
	   this.registerDate=registerDate;
   }
   void setUserID(String userID)
   {
	   this.userID=userID;
   }
   void setSellerIntro(String sellerIntro)
   {
	   this.sellerIntro=sellerIntro;
   }
   String getSellerID()
   {
	   return this.sellerID;
   }
   String getRegisterDate()
   {
	   return this.registerDate;
   }
   String getUserID()
   {
	   return this.userID;
   }
   String getSellerIntro()
   {
	   return this.sellerIntro;
   }

   
}
