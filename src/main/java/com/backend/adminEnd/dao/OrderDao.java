package com.backend.adminEnd.dao;

import com.backend.adminEnd.model.OrderEntity;

import java.util.List;

/**
 * Created by kevin on 2017/4/11.
 */
public interface OrderDao {
    public void removeOrder(String orderId);
    public List<OrderEntity> listOrder();
    public OrderEntity getOrderById(String orderId);
}
