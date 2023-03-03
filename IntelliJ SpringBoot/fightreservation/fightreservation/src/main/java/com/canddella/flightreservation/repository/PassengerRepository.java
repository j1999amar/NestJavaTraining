package com.canddella.flightreservation.repository;

import com.canddella.flightreservation.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
