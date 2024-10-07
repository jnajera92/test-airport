package com.myairline.airport.adapter.persistence.port;

import com.myairline.airport.adapter.converter.UserConverter;
import com.myairline.airport.core.exceptions.ResourceNotFoundException;
import com.myairline.airport.core.model.UserModel;
import com.myairline.airport.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private UserJPARepository userJPARepository;

    @Override
    public UserModel findByUser (UserModel user) {

        return UserConverter
                    .INSTANCE
                        .convertUserToUserModel(
                                userJPARepository
                                        .findByIdAndUsernameAndPassport(
                                                user.getUserId(),
                                                user.getUserName(),
                                                user.getPassport(),
                                                user.getAge())
                                        .orElseThrow()
                        );
    }

    @Override
    public List<UserModel> findAll() {

        return UserConverter
                    .INSTANCE
                        .convertUserEntityListToUserModelList(
                                userJPARepository.findAll());
    }

    @Override
    public UserModel saveUser(UserModel user) {

        return UserConverter
                .INSTANCE
                    .convertUserToUserModel(
                            userJPARepository
                                    .save(
                                            UserConverter
                                                    .INSTANCE
                                                    .convertUserModelToUserEntity(user))
                    );
    }
}
