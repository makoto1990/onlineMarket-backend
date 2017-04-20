package com.backend.adminEnd.service;

import com.backend.adminEnd.dao.SellerDao;
import com.backend.adminEnd.model.SellerEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lk on 4/13/17.
 */
public class SellerServiceImpl implements SellerService {

    private SellerDao sellerDao;

    public void setSellerDao(SellerDao sellerDao) {
        this.sellerDao = sellerDao;
    }

    @Override
    @Transactional
    public void addSeller(SellerEntity seller) {
        this.sellerDao.addSeller(seller);
    }

    @Override
    @Transactional
    public void updateSeller(SellerEntity seller) {
        this.sellerDao.updateSeller(seller);
    }

    @Override
    @Transactional
    public List<SellerEntity> listSeller() {
        return this.sellerDao.listSeller();
    }

    @Override
    @Transactional
    public SellerEntity getSellerById(String sellerId) {
        return this.sellerDao.getSellerById(sellerId);
    }

    @Override
    @Transactional
    public void removeSeller(String sellerId) {
        this.sellerDao.removeSeller(sellerId);
    }
}
