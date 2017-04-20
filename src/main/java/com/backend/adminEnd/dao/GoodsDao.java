package com.backend.adminEnd.dao;

import com.backend.adminEnd.model.GoodsEntity;

import java.util.List;

/**
 * Created by kevin on 2017/4/11.
 */
public interface GoodsDao {
    public List<GoodsEntity> listGoods();
    public GoodsEntity getGoodsByGoodsId(String goodsId);
    public void removeGoods(String goodsId);
}
