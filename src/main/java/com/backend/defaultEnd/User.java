package com.backend.defaultEnd;

public class User {
    private String userID;//�û����
    private String registerDate;//	ע��ʱ��
    private String userName;//�û��ǳ�
    private String password;//	�û�����
    private String realName;//	��ʵ����
    private String IDnumber;//	���֤��
    private String Phone;//	��ϵ�绰
    private String userStatus;//	�û�״̬
    private String Postcode;//	�ʱ�
    private String Province;//	ʡ��
    private String City;//	����
    private String District;//	����
    private String Street;//	�ֵ�
    private String Address;//	��ϸ��ַ
    private int isManager;//	�Ƿ��ǹ���Ա0��ʾ���ǣ�1��ʾ��

    void setuserID(String userID) {
        this.userID = userID;
    }

    void setregisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    void setuserName(String userName) {
        this.userName = userName;
    }

    void setpassword(String password) {
        this.password = password;
    }

    void setrealName(String realName) {
        this.realName = realName;
    }

    void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber;
    }

    void setPhone(String Phone) {
        this.Phone = Phone;
    }

    void setuserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    void setPostcode(String Postcode) {
        this.Postcode = Postcode;
    }

    void setProvince(String Province) {
        this.Province = Province;
    }

    void setCity(String City) {
        this.City = City;
    }

    void setDistrict(String District) {
        this.District = District;
    }

    void setStreet(String Street) {
        this.Street = Street;
    }

    void setAddress(String Address) {
        this.Address = Address;
    }

    void setisManager(int isManager) {
        this.isManager = isManager;
    }

    String getuserID() {
        return this.userID;
    }

    String getregisterDate() {
        return this.registerDate;
    }

    String getuserName() {
        return this.userName;
    }

    String getpassword() {
        return this.password;
    }

    String getrealName() {
        return this.realName;
    }

    String getIDnumber() {
        return this.IDnumber;
    }

    String getPhone() {
        return this.Phone;
    }

    String getuserStatus() {
        return this.userStatus;
    }

    String getPostcode() {
        return this.Postcode;
    }

    String getProvince() {
        return this.Province;
    }

    String getCity() {
        return this.City;
    }

    String getDistrict() {
        return this.District;
    }

    String getStreet() {
        return this.Street;
    }

    String getAddress() {
        return this.Address;
    }

    int getisManager() {
        return this.isManager;
    }
}
