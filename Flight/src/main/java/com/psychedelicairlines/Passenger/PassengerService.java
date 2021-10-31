package com.psychedelicairlines.Passenger;

import com.psychedelicairlines.Database.DatabaseFlightDAO;
import com.psychedelicairlines.Flights.FlightBookingService;
import com.psychedelicairlines.Flights.FlightDetails;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class PassengerService implements DatabaseFlightDAO {
   // Passenger passenger1 = new Passenger({this.name});
    ArrayList<Object> passengerArrayList = new ArrayList<>();
    FlightBookingService flightBookingService = new FlightBookingService();

    public void enterPassengerDetailsPeru(){


        Scanner details = new Scanner(System.in);
        System.out.println("Prove you're not a robot; enter your destination");
        String countryPeru1 = details.nextLine();

        if (countryPeru1.toUpperCase(Locale.ROOT).equals("PERU")) {

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


            //FlightBookingService service = new FlightBookingService();
            //String country = service.getCountry();

            //show all of the flight details and passenger details and ideally send this all in an email to user:
            System.out.println("");
            System.out.println("Here are your personal details:");
            System.out.println("");
            Passenger passengeri = new Passenger(id, FlightBookingService.countryPeru, name, email, gender, mobile, passport);
            System.out.println(passengeri.toString());
            System.out.println("");
            System.out.println("May The Odds Be Ever In Your Favour!");


        } else {
            System.out.println("GOT YA, ROBOT!");
            System.out.println("");
            flightBookingService.startBooking();

        }



    }


    public void enterPassengerDetailsMadagascar() {

        Scanner details = new Scanner(System.in);
        System.out.println("Prove you're not a robot; enter your destination");
        String countryMadagascar1 = details.nextLine();

        if (countryMadagascar1.toUpperCase(Locale.ROOT).equals("MADAGASCAR")) {

            System.out.println("Please enter your name:");
            String name = details.nextLine();
            //Passenger passenger1 = new Passenger(name);
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
            ID idGenerate = new ID();
            StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);


            //FlightBookingService service = new FlightBookingService();
            //String country = service.getCountry();

            //show all of the flight details and passenger details and ideally send this all in an email to user:
            System.out.println("");
            System.out.println("Here are your personal details:");
            System.out.println("");
            Passenger passengeri = new Passenger(id, FlightBookingService.countryMadagascar, name, email, gender, mobile, passport);
            System.out.println(passengeri.toString());
            System.out.println("");
            System.out.println("May The Odds Be Ever In Your Favour!");


            // creating an empty Arraylist
            ArrayList<String> passengerArrayList = new ArrayList<String>();
            //adding passenger to arrayList
            passengerArrayList.add(passengeri.toString());
            //creating an empty Array
            String[] passengerArray = new String[madagascar.getCapacity()];

            //filling in Array with items from the list by matching up the index
        } else {
            System.out.println("GOT YA, ROBOT!");
            System.out.println("");
            flightBookingService.startBooking();

        }
    }


    public void enterPassengerDetailsSaudi() {



        Scanner details = new Scanner(System.in);
        System.out.println("Prove you're not a robot; enter your destination");
        String countrySaudi1 = details.nextLine();

        if (countrySaudi1.toUpperCase(Locale.ROOT).equals("SAUDI")) {

            System.out.println("Please enter your name:");
            String name = details.nextLine();
            //Passenger passenger1 = new Passenger(name);
            System.out.println("Please enter your email:");
            String email = details.nextLine();

            System.out.println("Please enter your gender:");
            String gender1 = details.nextLine();
            Gender gender = Gender.valueOf(gender1);

            System.out.println("Please enter your Passport Number:");
            String passport = details.nextLine();

            System.out.println("Please enter your Phone Number:");
            Integer mobile = details.nextInt();

            System.out.println("");
            ID idGenerate = new ID();
            StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);


//                FlightBookingService service = new FlightBookingService();
//                String country = service.getCountry();

            //show all of the flight details and passenger details and ideally send this all in an email to user:
            System.out.println("");
            System.out.println("Here are your personal details:");
            System.out.println("");
            Passenger passengeri = new Passenger(id, FlightBookingService.countrySaudi, name, email, gender, mobile, passport);
            System.out.println(passengeri.toString());
            System.out.println("");
            System.out.println("May The Odds Be Ever In Your Favour!");


            // creating an empty Arraylist
            //adding passenger to arrayList
            passengerArrayList.add(passengeri.toString());
            //creating an empty Array
            String[] passengerArray = new String[saudi.getCapacity()];

            //filling in Array with items from the list by matching up the index


        } else {
            System.out.println("GOT YA, ROBOT!");
            System.out.println("");
            flightBookingService.startBooking();

        }
    }


    public void enterPassengerDetailsAustralia(){


        Scanner details = new Scanner(System.in);
        System.out.println("Prove you're not a robot; enter your destination");
        String countryAustralia1 = details.nextLine();

        if (countryAustralia1.toUpperCase(Locale.ROOT).equals("AUSTRALIA")) {
            //FlightCountry countryPeruDestination = FlightCountry.valueOf(countryPeru1.toUpperCase(Locale.ROOT));
            String countryAustraliaDestination = countryAustralia1.toUpperCase(Locale.ROOT);

            System.out.println("Please enter your name:");
            String name = details.nextLine();
            //Passenger passenger1 = new Passenger(name);
            System.out.println("Please enter your email:");
            String email = details.nextLine();

            System.out.println("Please enter your gender:");
            String gender1 = details.nextLine();
            Gender gender = Gender.valueOf(gender1);

            System.out.println("Please enter your Passport Number:");
            String passport = details.nextLine();

            System.out.println("Please enter your Phone Number:");
            Integer mobile = details.nextInt();

            System.out.println("");
            ID idGenerate = new ID();
            StringBuilder id = idGenerate.generateId("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", 6);


            // FlightBookingService service = new FlightBookingService();
//                    String country = service.getCountry();

            //show all of the flight details and passenger details and ideally send this all in an email to user:
            System.out.println("");
            System.out.println("Here are your personal details:");
            System.out.println("");
            Passenger passengeri = new Passenger(id, FlightBookingService.countryAustralia, name, email, gender, mobile, passport);
            System.out.println(passengeri.toString());
            System.out.println("");
            System.out.println("May The Odds Be Ever In Your Favour!");

            addToList(passengeri);



        } else {
            System.out.println("GOT YA, ROBOT!");
            System.out.println("");
            flightBookingService.startBooking();

        }}

    @Override
    public void addToList(Object object){
        passengerArrayList.add(object);
    }

    @Override
    public void deleteFromList(Object object){
        passengerArrayList.remove(object);
    }

}