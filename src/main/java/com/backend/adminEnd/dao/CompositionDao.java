package com.backend.adminEnd.dao;

import com.backend.adminEnd.model.CompositionEntity;

import java.util.List;

/**
 * Created by kevin on 2017/4/11.
 */
public interface CompositionDao {
    public List<CompositionEntity> listComposition();
    public CompositionEntity getCompositionByOrderGoodsId(String orderGoodsId);
    public List<CompositionEntity> getCompositionBySellerId(String sellerId);
    public void removeComposition(String orderGoodsId);
}
