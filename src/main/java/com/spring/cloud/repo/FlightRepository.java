package com.spring.cloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.cloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
