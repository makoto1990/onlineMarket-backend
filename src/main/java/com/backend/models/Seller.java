package com.backend.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by kevin on 2017/4/25.
 */
@Entity
public class Seller {
    private String sellerId;
    private Timestamp registerDate;
    private String userId;
    private String sellerIntro;

    @Id
    @Column(name = "sellerID", nullable = false, length = 12)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Basic
    @Column(name = "registerDate", nullable = true)
    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    @Basic
    @Column(name = "userID", nullable = true, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "sellerIntro", nullable = true, length = 4000)
    public String getSellerIntro() {
        return sellerIntro;
    }

    public void setSellerIntro(String sellerIntro) {
        this.sellerIntro = sellerIntro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;

        if (sellerId != null ? !sellerId.equals(seller.sellerId) : seller.sellerId != null) return false;
        if (registerDate != null ? !registerDate.equals(seller.registerDate) : seller.registerDate != null)
            return false;
        if (userId != null ? !userId.equals(seller.userId) : seller.userId != null) return false;
        if (sellerIntro != null ? !sellerIntro.equals(seller.sellerIntro) : seller.sellerIntro != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sellerId != null ? sellerId.hashCode() : 0;
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (sellerIntro != null ? sellerIntro.hashCode() : 0);
        return result;
    }
}
