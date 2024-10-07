package com.myairline.airport.adapter.rest.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @NotEmpty(message = "FirstName may be not empty")
    private String firstName;

    @NotEmpty(message = "FirstName may be not empty")
    private String lastName;

    private int age;

    private String passport;

    private FlightDTO flight;
}
