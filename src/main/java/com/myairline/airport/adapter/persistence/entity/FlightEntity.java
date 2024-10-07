package com.myairline.airport.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*;


import java.sql.Timestamp;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vuelos")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "hora_salida")
    private Timestamp starFlight;

    @Column(name = "hora_llegada")
    private Timestamp endFlight;

    @Column(name = "precio")
    private Long price;



}
