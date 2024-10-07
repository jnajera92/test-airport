package com.myairline.airport.adapter.converter;

import com.myairline.airport.adapter.persistence.entity.FlightEntity;
import com.myairline.airport.adapter.persistence.entity.UserEntity;
import com.myairline.airport.adapter.rest.dto.FlightDTO;
import com.myairline.airport.adapter.rest.dto.UserDTO;
import com.myairline.airport.core.model.FlightModel;
import com.myairline.airport.core.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserConverter {

    UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

    @Mapping(target = "userId", source = "id")
    @Mapping(target = "flight", source = "flight", qualifiedByName = "toFlightDTOToFlightModel")
    UserModel convertUserToUserModel(UserEntity userEntity);

    List<UserModel> convertUserEntityListToUserModelList(List<UserEntity> userEntities);

    @Mapping(target = "id", source = "userId")
    @Mapping(target = "flight", source = "flight", qualifiedByName = "toFlightEntity")
    UserEntity convertUserModelToUserEntity(UserModel userModel);

    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "age", source = "age")
    @Mapping(target = "userName", expression = "java(userDTO.getFirstName() +\" \" + userDTO.getLastName())")
    @Mapping(target = "flight", source = "flight", qualifiedByName = "convertFlightModelToFlightDTO")
    UserModel convertUserToUserModel(UserDTO userDTO);

    @Mapping(target = "firstName", expression = "java(userModel.getUserName().split(\" \")[0])")
    @Mapping(target = "lastName", expression = "java(userModel.getUserName().split(\" \")[1])")
    @Mapping(target = "flight.flightId", source = "flight.id")
    UserDTO convertUserModelToUserDTO(UserModel userModel);

    @Named("convertFlightModelToFlightDTO")
    FlightModel convertFlightModelToFlightDTO(FlightDTO flightDTO);

    @Named("toFlightEntity")
    FlightEntity toFlightEntity(FlightModel flightModel);

    @Named("toFlightDTOToFlightModel")
    FlightModel toFlightDTOToFlightModel(FlightEntity flight);
}
