package com.backend.adminEnd.service;

import com.backend.adminEnd.model.UserEntity;

import java.util.List;

/**
 * Created by kevin on 2017/4/11.
 */
public interface UserService {
    public void addUser(UserEntity user);
    public void updateUser(UserEntity user);
    public List<UserEntity> listUser();
    public UserEntity getUserById(String userId);
    public void removeUser(String userId);
}
