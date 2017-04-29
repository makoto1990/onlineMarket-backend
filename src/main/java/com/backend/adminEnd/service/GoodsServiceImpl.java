package com.backend.adminEnd.service;

import com.backend.adminEnd.dao.GoodsDao;
import com.backend.adminEnd.model.GoodsEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lk on 4/13/17.
 */
public class GoodsServiceImpl implements GoodsService {

    private GoodsDao goodsDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    @Transactional
    public List<GoodsEntity> listGoods() {
        return this.goodsDao.listGoods();
    }

    @Override
    @Transactional
    public GoodsEntity getGoodsByGoodsId(String goodsId) {
        return this.goodsDao.getGoodsByGoodsId(goodsId);
    }

    @Override
    @Transactional
    public void removeGoods(String goodsId) {
        this.removeGoods(goodsId);
    }
}
