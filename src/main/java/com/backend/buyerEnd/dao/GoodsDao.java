package main.java.com.backend.buyerEnd.dao;

import main.java.com.backend.buyerEnd.model.Goods;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface GoodsDao {
    public List<Goods> listGoods();
    public Goods getGoodsByGoodsId(String goodsId);
    public void removeGoods(String goodsId);
}
