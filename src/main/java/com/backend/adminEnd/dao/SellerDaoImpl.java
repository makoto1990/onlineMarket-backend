package com.backend.adminEnd.dao;

import com.backend.adminEnd.model.SellerEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by lk on 4/24/17.
 */
public class SellerDaoImpl implements SellerDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    public void addSeller(SellerEntity seller) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(seller);
    }

    @Override
    public void updateSeller(SellerEntity seller) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(seller);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<SellerEntity> listSeller() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from SellerEntity").list();
    }

    @Override
    public SellerEntity getSellerById(String sellerId) {
        Session session = this.sessionFactory.getCurrentSession();
        return (SellerEntity) session.load(SellerEntity.class, sellerId);
    }

    @Override
    public void removeSeller(String sellerId) {
        Session session = this.sessionFactory.getCurrentSession();
        SellerEntity s = (SellerEntity) session.load(SellerEntity.class, sellerId);
        if (s != null) {
            session.delete(s);
        }
    }
}
