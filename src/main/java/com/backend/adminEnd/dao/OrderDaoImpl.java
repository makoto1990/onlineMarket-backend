package com.backend.adminEnd.dao;

import com.backend.adminEnd.model.OrderEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by lk on 4/24/17.
 */
public class OrderDaoImpl implements OrderDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void removeOrder(String orderId) {
        Session session = this.sessionFactory.getCurrentSession();
        OrderEntity o = (OrderEntity) session.load(OrderEntity.class, orderId);
        if (o != null) {
            session.delete(o);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<OrderEntity> listOrder() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from OrderEntity").list();
    }

    @Override
    public OrderEntity getOrderById(String orderId) {
        Session session = this.sessionFactory.getCurrentSession();
        return (OrderEntity) session.load(OrderEntity.class, orderId);
    }
}
