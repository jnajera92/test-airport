package com.myairline.airport.application;

import com.myairline.airport.core.model.UserModel;

public interface AirportService {

    UserModel getInfoByUser(UserModel userModel);

    void saveInfoByUser(UserModel userModel);

    void deleteInfoByUser(UserModel userModel);
}
