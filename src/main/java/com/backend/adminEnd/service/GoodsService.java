package com.backend.adminEnd.service;

import com.backend.adminEnd.model.GoodsEntity;

import java.util.List;

/**
 * Created by kevin on 2017/4/11.
 */
public interface GoodsService {
    public List<GoodsEntity> listGoods();
    public GoodsEntity getGoodsByGoodsId(String goodsId);
    public void removeGoods(String goodsId);
}
