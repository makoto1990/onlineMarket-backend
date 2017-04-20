package com.backend.adminEnd.service;

import com.backend.adminEnd.dao.CompositionDao;
import com.backend.adminEnd.model.CompositionEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lk on 4/13/17.
 */
public class CompositionServiceImpl implements CompositionService {

    private CompositionDao compositionDao;

    public void setCompositionDao(CompositionDao compositionDao) {
        this.compositionDao = compositionDao;
    }

    @Override
    @Transactional
    public List<CompositionEntity> listComposition() {
        return this.compositionDao.listComposition();
    }

    @Override
    @Transactional
    public CompositionEntity getCompositionByOrderGoodsId(String orderGoodsId) {
        return this.compositionDao.getCompositionByOrderGoodsId(orderGoodsId);
    }

    @Override
    @Transactional
    public List<CompositionEntity> getCompositionBySellerId(String sellerId) {
        return this.compositionDao.getCompositionBySellerId(sellerId);
    }

    @Override
    @Transactional
    public void removeComposition(String orderGoodsId) {
        this.compositionDao.removeComposition(orderGoodsId);
    }
}
