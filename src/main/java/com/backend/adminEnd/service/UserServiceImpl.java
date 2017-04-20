package com.backend.adminEnd.service;

import com.backend.adminEnd.dao.UserDao;
import com.backend.adminEnd.model.UserEntity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lk on 4/13/17.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(UserEntity user) {
        this.userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(UserEntity user) {
        this.userDao.updateUser(user);
    }

    @Override
    @Transactional
    public List<UserEntity> listUser() {
        return this.userDao.listUser();
    }

    @Override
    @Transactional
    public UserEntity getUserById(String userId) {
        return this.userDao.getUserById(userId);
    }

    @Override
    @Transactional
    public void removeUser(String userId) {
        this.userDao.removeUser(userId);
    }
}
