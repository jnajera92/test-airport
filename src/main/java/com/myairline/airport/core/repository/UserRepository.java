package com.myairline.airport.core.repository;

import com.myairline.airport.core.model.UserModel;

import java.util.List;

public interface UserRepository {

    UserModel findByUser(UserModel userModel);

    List<UserModel> findAll();

    UserModel saveUser(UserModel user);

}
