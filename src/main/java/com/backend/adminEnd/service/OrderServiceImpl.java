package com.backend.adminEnd.service;

import com.backend.adminEnd.dao.OrderDao;
import com.backend.adminEnd.model.OrderEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lk on 4/13/17.
 */
public class OrderServiceImpl implements OrderService {

    private OrderDao orderDao;

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    @Transactional
    public void removeOrder(String orderId) {
        this.orderDao.removeOrder(orderId);
    }

    @Override
    @Transactional
    public List<OrderEntity> listOrder() {
        return this.orderDao.listOrder();
    }

    @Override
    @Transactional
    public OrderEntity getOrderById(String orderId) {
        return this.orderDao.getOrderById(orderId);
    }
}
