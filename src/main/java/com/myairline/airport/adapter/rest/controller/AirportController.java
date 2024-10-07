package com.myairline.airport.adapter.rest.controller;

import com.myairline.airport.adapter.converter.UserConverter;
import com.myairline.airport.adapter.rest.dto.UserDTO;
import com.myairline.airport.application.AirportService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping
    UserDTO getInfoByUser(@RequestParam @Valid String firstName,
                          @RequestParam @Valid String lastName,
                          @RequestParam @Valid String passport) {

    return  UserConverter
                .INSTANCE
                    .convertUserModelToUserDTO(airportService
                            .getInfoByUser(
                                    UserConverter
                                            .INSTANCE
                                            .convertUserToUserModel(
                                                    UserDTO.builder()
                                                            .firstName(firstName)
                                                            .lastName(lastName)
                                                            .passport(passport)
                                                            .build()
                                            )));
    }
}
