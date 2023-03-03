package com.canddella.flightreservation.repository;

import com.canddella.flightreservation.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	
	
}
