package com.canddella.flightreservation.services;

import com.canddella.flightreservation.dto.ReservationRequest;
import com.canddella.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}