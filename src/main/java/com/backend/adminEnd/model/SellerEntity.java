package com.backend.adminEnd.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by kevin on 2017/4/25.
 */
@Entity
@Table(name = "[Seller]", schema = "dbo", catalog = "onlineMarket")
public class SellerEntity {
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

        SellerEntity that = (SellerEntity) o;

        if (sellerId != null ? !sellerId.equals(that.sellerId) : that.sellerId != null) return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (sellerIntro != null ? !sellerIntro.equals(that.sellerIntro) : that.sellerIntro != null) return false;

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
