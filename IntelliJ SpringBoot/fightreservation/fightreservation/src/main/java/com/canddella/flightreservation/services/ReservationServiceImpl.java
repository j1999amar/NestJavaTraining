package com.canddella.flightreservation.services;

import com.canddella.flightreservation.dto.ReservationRequest;
import com.canddella.flightreservation.entities.Flight;
import com.canddella.flightreservation.entities.Passenger;
import com.canddella.flightreservation.entities.Reservation;
import com.canddella.flightreservation.repository.FlightRepository;
import com.canddella.flightreservation.repository.PassengerRepository;
import com.canddella.flightreservation.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	@Transactional
	public Reservation bookFlight(ReservationRequest request) {
		
		Long flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		reservation.setNumberOfBags(0);
		Reservation savedReservation = reservationRepository.save(reservation);
		
		return savedReservation;
	}


	
}
