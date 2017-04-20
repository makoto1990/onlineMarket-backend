package com.backend.adminEnd.service;

import com.backend.adminEnd.model.OrderEntity;

import java.util.List;

/**
 * Created by kevin on 2017/4/11.
 */
public interface OrderService {
    public void removeOrder(String orderId);
    public List<OrderEntity> listOrder();
    public OrderEntity getOrderById(String orderId);
}
