package com.backend.adminEnd.dao;

import com.backend.adminEnd.model.GoodsEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

/**
 * Created by lk on 4/24/17.
 */
public class GoodsDaoImpl implements GoodsDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<GoodsEntity> listGoods() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from GoodsEntity").list();
    }

    @Override
    public GoodsEntity getGoodsByGoodsId(String goodsId) {
        Session session = this.sessionFactory.getCurrentSession();
        return (GoodsEntity) session.load(GoodsEntity.class, goodsId);
    }

    @Override
    public void removeGoods(String goodsId) {
        Session session = this.sessionFactory.getCurrentSession();
        GoodsEntity g = (GoodsEntity) session.load(GoodsEntity.class, goodsId);
        if (g != null) {
            session.delete(g);
        }
    }
}
