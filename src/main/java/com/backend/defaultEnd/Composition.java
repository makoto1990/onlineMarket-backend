package main.java.com.backend.defaultEnd;

public class Composition {
    private String order_goodsID;//����-��Ʒ���
    private String sellerID;//���ұ��
    private String goodsID;//��Ʒ���
    private float goodsAmount;//������
    void setorder_goodsID(String order_goodsID)
    {
    	this.order_goodsID=order_goodsID;
    }
    void setsellerID(String sellerID)
    {
    	this.sellerID=sellerID;
    }
    void setgoodsID(String goodsID)
    {
    	this.goodsID=goodsID;
    }
    void setgoodsAmount(float goodsAmount)
    {
    	this.goodsAmount=goodsAmount;
    }
    String getorder_goodsID()
    {
    	return this.order_goodsID;
    }
    String getsellerID()
    {
    	return this.sellerID;
    }
    String getgoodsID()
    {
    	return this.goodsID;
    }
    float getgoodsAmount()
    {
    	return this.goodsAmount;
    }
    
}
