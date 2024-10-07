package com.myairline.airport.core.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private Long userId;

    private String userName;

    private int age;

    private String passport;

    private FlightModel flight;

}
