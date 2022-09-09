package com.example.Airline_API.repositories;

import com.example.Airline_API.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight,Long> {
}
