package com.myairline.airport.core.repository;

import com.myairline.airport.core.model.FlightModel;

import java.util.List;
import java.util.Optional;

public interface FlightRepository {

    Optional<FlightModel> findByUserId(Long userId);

    List<FlightModel> findAll();

    FlightModel saveFlight(FlightModel user);

}
