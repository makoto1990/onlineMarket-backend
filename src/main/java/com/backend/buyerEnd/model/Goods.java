package main.java.com.backend.buyerEnd.model;

public class Goods {
    private String goodsID;   //锟斤拷品锟斤拷锟�
    private String goodsName;  //锟斤拷品锟斤拷锟斤拷
    private String goodsIntro;
    private int goodsCount;  //锟斤拷锟斤拷锟斤拷锟�
    private String goodsSize; 
    private float goodsPrice; //锟斤拷锟斤拷
    private String storeWay; //锟斤拷锟斤拷锟叫达拷锟斤拷
    private String sourceArea;//原锟斤拷锟斤拷
    private String setDate;//锟较硷拷时锟斤拷
    private String sellerID; //锟教家憋拷锟�
    private String goodsType;//锟斤拷品锟斤拷锟�
    private float leastAmount;//锟斤拷锟斤拷锟斤拷
    private float largeAmount;//锟斤拷锟斤拷锟缴癸拷锟斤拷锟斤拷锟斤拷
    private float largePrice;//锟斤拷锟斤拷锟缴癸拷锟斤拷
    private String Picture; //锟斤拷品图片
    
    void setgoodsID(String  goodsID)
    {
    	this.goodsID=goodsID;
    }
    void setgoodsName(String  goodsName)
    {
    	this.goodsName=goodsName;
    }
    void setgoodsIntro(String  goodsIntro)
    {
    	this.goodsIntro=goodsIntro;
    }
    void setgoodsCount(int  goodsCount)
    {
    	this.goodsCount=goodsCount;
    }
    void setgoodsSize(String  goodsSize)
    {
    	this.goodsSize=goodsSize;
    } 
    void setgoodsPrice(float  goodsPrice)
    {
    	this.goodsPrice=goodsPrice;
    }
    void setstoreWay(String  storeWay)
    {
    	this.storeWay=storeWay;
    }
    void setsourceArea(String  sourceArea)
    {
    	this.sourceArea=sourceArea;
    }
    void setsetDate(String  setDate)
    {
    	this.setDate=setDate;
    }
    void setsellerID(String  sellerID)
    {
    	this.sellerID=sellerID;
    }
    void setgoodsType(String  goodsType)
    {
    	this.goodsType=goodsType;
    }
    void setleastAmount(float  leastAmount)
    {
    	this.leastAmount=leastAmount;
    }
    void setlargeAmount(float  largeAmount)
    {
    	this.largeAmount=largeAmount;
    }
    void setlargePrice(float  largePrice)
    {
    	this.largePrice=largePrice;
    }
    String getgoodsID()
    {
    	return this.goodsID;
    }
    String getgoodsName()
    {
    	return this.goodsName;
    }
    String getgoodsIntro()
    {
    	return this.goodsIntro;
    }
    String getsourceArea()
    {
    	return this.sourceArea;
    }
    String getsetDate()
    {
    	return this.setDate;
    }
    String getsellerID()
    {
    	return this.sellerID;
    }
    String getgoodsType()
    {
    	return this.goodsType;
    }
    String getPicture()
    {
    	return this.Picture;
    }
    int getgoodsCount()
    {
    	return this.goodsCount;
    }
    String getgoodsSize()
    {
    	return this.goodsSize;
    }
    float getgoodsPrice()
    {
    	return this.goodsPrice;
    }
    String getstoreWay()
    {
    	return this.storeWay;
    }
    float getleastAmount()
    {
    	return this.leastAmount;
    }
    float getlargeAmount()
    {
    	return this.largeAmount;
    }
    float getlargePrice()
    {
    	return this.largePrice;
    }
	public String getGoodsID() {
		return goodsID;
	}
	public void setGoodsID(String goodsID) {
		this.goodsID = goodsID;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsIntro() {
		return goodsIntro;
	}
	public void setGoodsIntro(String goodsIntro) {
		this.goodsIntro = goodsIntro;
	}
	public int getGoodsCount() {
		return goodsCount;
	}
	public void setGoodsCount(int goodsCount) {
		this.goodsCount = goodsCount;
	}
	public String getGoodsSize() {
		return goodsSize;
	}
	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	public float getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getStoreWay() {
		return storeWay;
	}
	public void setStoreWay(String storeWay) {
		this.storeWay = storeWay;
	}
	public String getSourceArea() {
		return sourceArea;
	}
	public void setSourceArea(String sourceArea) {
		this.sourceArea = sourceArea;
	}
	public String getSetDate() {
		return setDate;
	}
	public void setSetDate(String setDate) {
		this.setDate = setDate;
	}
	public String getSellerID() {
		return sellerID;
	}
	public void setSellerID(String sellerID) {
		this.sellerID = sellerID;
	}
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public float getLeastAmount() {
		return leastAmount;
	}
	public void setLeastAmount(float leastAmount) {
		this.leastAmount = leastAmount;
	}
	public float getLargeAmount() {
		return largeAmount;
	}
	public void setLargeAmount(float largeAmount) {
		this.largeAmount = largeAmount;
	}
	public float getLargePrice() {
		return largePrice;
	}
	public void setLargePrice(float largePrice) {
		this.largePrice = largePrice;
	}
	public void setPicture(String picture) {
		Picture = picture;
	}
    
}