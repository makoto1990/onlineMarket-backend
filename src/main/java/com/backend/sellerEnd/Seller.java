package com.backend.sellerEnd;

public class Seller {
   private String sellerID; //���ұ��
   private String registerDate;  //ע��ʱ��
   private String userID;   //�û����
   private String sellerIntro;  //���Ҽ��
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
