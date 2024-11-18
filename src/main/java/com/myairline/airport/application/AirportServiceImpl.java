package com.myairline.airport.application;

import com.myairline.airport.core.model.UserModel;
import com.myairline.airport.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportServiceImpl implements AirportService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserModel getInfoByUser(UserModel userModel) {
        return userRepository.findByUser(userModel);
    }

    @Override
    public void saveInfoByUser(UserModel userModel) {
        userRepository.saveUser(userModel);
    }

    @Override
    public void deleteInfoByUser(UserModel userModel) {
        //delete

    }
}
