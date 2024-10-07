package com.myairline.airport.core.model;

import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FlightModel {

    private Long id;

    private Timestamp starFlight;

    private Timestamp endFlight;

    private Long price;

}
