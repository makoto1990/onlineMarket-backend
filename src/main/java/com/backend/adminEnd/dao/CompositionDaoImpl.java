package com.backend.adminEnd.dao;

import com.backend.adminEnd.model.CompositionEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by lk on 4/24/17.
 */
public class CompositionDaoImpl implements CompositionDao {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sf){
        this.sessionFactory = sf;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<CompositionEntity> listComposition() {
        Session session = this.sessionFactory.getCurrentSession();
        return session.createQuery("from CompositionEntity").list();
    }

    @Override
    public CompositionEntity getCompositionByOrderGoodsId(String orderGoodsId) {
        Session session = this.sessionFactory.getCurrentSession();
        return (CompositionEntity) session.load(CompositionEntity.class, orderGoodsId);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<CompositionEntity> getCompositionBySellerId(String sellerId) {
        Session session = this.sessionFactory.getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<CompositionEntity> criteria = builder.createQuery(CompositionEntity.class);
        Root<CompositionEntity> root = criteria.from(CompositionEntity.class);
        criteria.select(root);
        criteria.where(builder.equal(root.get("sellerId"), sellerId));
        return session.createQuery(criteria).getResultList();
    }

    @Override
    public void removeComposition(String orderGoodsId) {
        Session session = this.sessionFactory.getCurrentSession();
        CompositionEntity c = (CompositionEntity) session.load(CompositionEntity.class, orderGoodsId);
        if (c != null) {
            session.delete(c);
        }
    }
}
