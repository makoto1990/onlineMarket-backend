package com.backend.adminEnd.model;

import javax.persistence.*;

/**
 * Created by kevin on 2017/4/25.
 */
@Entity
@Table(name = "[Composition]", schema = "dbo", catalog = "onlineMarket")
public class CompositionEntity {
    private String orderGoodsId;
    private Double goodsAmount;
    private String sellerId;
    private String goodsId;
    private String orderId;

    @Id
    @Column(name = "order_goodsID", nullable = false, length = 24)
    public String getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(String orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    @Basic
    @Column(name = "goodsAmount", nullable = true, precision = 0)
    public Double getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Double goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    @Basic
    @Column(name = "sellerID", nullable = true, length = 12)
    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @Basic
    @Column(name = "goodsID", nullable = true, length = 12)
    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "orderID", nullable = true, length = 12)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CompositionEntity that = (CompositionEntity) o;

        if (orderGoodsId != null ? !orderGoodsId.equals(that.orderGoodsId) : that.orderGoodsId != null) return false;
        if (goodsAmount != null ? !goodsAmount.equals(that.goodsAmount) : that.goodsAmount != null) return false;
        if (sellerId != null ? !sellerId.equals(that.sellerId) : that.sellerId != null) return false;
        if (goodsId != null ? !goodsId.equals(that.goodsId) : that.goodsId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderGoodsId != null ? orderGoodsId.hashCode() : 0;
        result = 31 * result + (goodsAmount != null ? goodsAmount.hashCode() : 0);
        result = 31 * result + (sellerId != null ? sellerId.hashCode() : 0);
        result = 31 * result + (goodsId != null ? goodsId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
