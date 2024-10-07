package com.myairline.airport.adapter.rest.dto;


import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {

    private String flightId;

    private Timestamp starFlight;

    private Timestamp endFlight;

    private Long price;

}
