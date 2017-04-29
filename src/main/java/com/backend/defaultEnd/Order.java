package com.backend.defaultEnd;


public class Order {
    private String orderID;//�������
    private String receiverName;//�ջ�������
    private String Phone;//��ϵ��ʽ
    private String orderStatus;//����״̬
    private String payTime;//����ʱ��
    private String deliveryTime;//����ʱ��
    private String confirmTime;//ȷ��/ȡ��ʱ��
    private String Postcode;//�ʱ�
    private String Address;//��ϸ��ַ
    private String creatTime;//����ʱ��
    private String userID;//�û����
    private String sellerID;//���ұ��
    private float shipCost;//�˷�
    private float allPrice;//��Ʒ�ܼ�

    void setorderID(String orderID) {
        this.orderID = orderID;
    }

    void setreceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    void setPhone(String Phone) {
        this.Phone = Phone;
    }

    void setorderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    void setpayTime(String payTime) {
        this.payTime = payTime;
    }

    void setdeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    void setconfirmTime(String confirmTime) {
        this.confirmTime = confirmTime;
    }

    void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    void setAddress(String Address) {
        this.Address = Address;
    }

    void setcreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    void setuserID(String userID) {
        this.userID = userID;
    }

    void setsellerID(String sellerID) {
        this.sellerID = sellerID;
    }

    void setshipCost(float shipCost) {
        this.shipCost = shipCost;
    }

    void setallPrice(float allPrice) {
        this.allPrice = allPrice;
    }

    String getorderID() {
        return this.orderID;
    }

    String getreceiverName() {
        return this.receiverName;
    }

    String getPhone() {
        return this.Phone;
    }

    String getorderStatus() {
        return this.orderStatus;
    }

    String getpayTime() {
        return this.payTime;
    }

    String getdeliveryTime() {
        return this.deliveryTime;
    }

    String getconfirmTime() {
        return this.confirmTime;
    }

    String getPostcode() {
        return this.Postcode;
    }

    String getAddress() {
        return this.Address;
    }

    String getcreatTime() {
        return this.creatTime;
    }

    String getuserID() {
        return this.userID;
    }

    String getsellerID() {
        return this.sellerID;
    }

    float getshipCost() {
        return this.shipCost;
    }

    float getallPrice() {
        return this.allPrice;
    }
}
