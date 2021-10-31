package com.psychedelicairlines.Passenger;

import com.psychedelicairlines.Database.DatabaseFlightDAO;
import com.psychedelicairlines.Flights.FlightBookingService;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PassengerTestService implements DatabaseFlightDAO {

    ArrayList<Object> passengerArrayList = new ArrayList<>();
    FlightBookingService flightBookingService = new FlightBookingService();

    public void enterPassengerDetails(){

        System.out.println("");
        System.out.println("Welcome to the Psychedelic Airline experience! Enter your details:");
        Scanner details = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = details.nextLine();

        System.out.println("Please enter your email:");
        String email = details.nextLine();

        System.out.println("Please enter your gender:");
        String gender1 = details.nextLine();
        Gender gender = Gender.valueOf(gender1.toUpperCase(Locale.ROOT));

        System.out.println("Please enter your Passport Number:");
        String passport = details.nextLine();

        System.out.println("Please enter your Phone Number:");
        Integer mobile = details.nextInt();

        System.out.println("");
        StringBuilder id = ID.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);
        
        
        flightBookingService.startBooking();

        System.out.println("");
        System.out.println("Here are your personal details:");
        System.out.println("");
        Passenger passengeri = new Passenger(id, FlightBookingService.country, name, email, gender, mobile, passport);
        System.out.println(passengeri.toString());
        System.out.println("");
        System.out.println("May The Odds Be Ever In Your Favour!");

    }




    @Override
    public void addToList(Object object){
        passengerArrayList.add(object);
    }

    @Override
    public void deleteFromList(Object object){
        passengerArrayList.remove(object);
    }
}
