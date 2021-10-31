package com.psychedelicairlines.Flights;

import com.psychedelicairlines.Database.DatabaseFlightDAO;
import com.psychedelicairlines.Passenger.Gender;
import com.psychedelicairlines.Passenger.ID;
import com.psychedelicairlines.Passenger.Passenger;
import com.psychedelicairlines.Passenger.PassengerService;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class FlightBookingService implements DatabaseFlightDAO {

    public static FlightCountry country;

//    public static FlightCountry countryPeru;
//    public static FlightCountry countryMadagascar;
//    public static FlightCountry countrySaudi;
//    public static FlightCountry countryAustralia;

    //private String country;




//    FlightCountry countryPeru = FlightCountry.PERU;
//    FlightCountry countryMadagascar = FlightCountry.MADAGASCAR;
//    FlightCountry countrySaudi = FlightCountry.SAUDI;
//    FlightCountry countryAustralia = FlightCountry.AUSTRALIA;

 /*   FlightDetails peru = new FlightDetails("Llama", "We ran out of money...", "PE-234", FlightCountry.PERU, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.NOVEMBER, 12, 13, 47), 957.00, 0, 0);

    FlightDetails madagascar = new FlightDetails("Seaplane Seabird", "Re-purposed from WW2. Book at own risk. BYOB.", "SS-001", FlightCountry.MADAGASCAR, FlightCountry.ENGLAND, LocalDateTime.of(2021, Month.JUNE, 20, 10, 30), 2300.00, 2, 0);

    FlightDetails australia = new FlightDetails("Down Under", "A really, really, really long flight!", "DU-123", FlightCountry.AUSTRALIA, FlightCountry.ENGLAND, LocalDateTime.of(2021, 12, 21, 13, 30), 800.00, 2, 0);

    FlightDetails saudi = new FlightDetails("Pilgrimage to Mecca","Enter at own risk, women cannot drive!", "SA-232",FlightCountry.SAUDI,FlightCountry.ENGLAND, LocalDateTime.of(2022, 03, 12 ,12, 30), 900.0,75,0);

    PassengerService passengerService = new PassengerService();

    List<Object> addFlightToList = List.of(peru, madagascar, australia, saudi);
*/

   /* public void startBooking(){

        FlightBookingService flightBookingService = new FlightBookingService();
        System.out.println("");
        System.out.println("To continue your booking, choose an option from below:");
        System.out.println("\n Option 1 - Book new flight \n Option 2 - Manage Booking \n Option 3 - EXIT");
        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();

        switch(input){
            case "1":
                displayFlights();
                break;
            case "2":
                System.out.println("Manage Booking");
                break;
            case "3":
                System.out.println("Exs--ter--min--ate!");
                System.exit(0);
                break;
        }
    }*/


//    public void displayFlights(){
//
//        
//
//        System.out.println("Option 1: " + peru.getDestination().toString() + "\n" + peru.getDate().toString() + "\n" + "£" + peru.getPrice().toString());
//        System.out.println("");
//
//        System.out.println("Option 2: " + madagascar.getDestination().toString() + "\n" + madagascar.getDate().toString() + "\n" + "£" + madagascar.getPrice().toString());
//        System.out.println("");
//
//        System.out.println("Option 3: " + saudi.getDestination().toString() + "\n" + saudi.getDate().toString() + "\n" + "£" + saudi.getPrice().toString());
//        System.out.println("");
//
//        System.out.println("Option 4: " + australia.getDestination().toString() + "\n" + australia.getDate().toString() + "\n" + "£" + australia.getPrice().toString());
//
//        Scanner scanner = new Scanner(System.in);
//        String flight = scanner.nextLine();
//
//        switch(flight) {
//
//            case "1":
//                System.out.println("Flight Name: " + peru.getFlightName().toString() + "\n" + "Description: " + peru.getFlightDescription().toString() + "\n"+ "Price: £" + peru.getPrice().toString());
//
//                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
//                String choice = scanner.nextLine();
//                switch (choice) {
//
//                    case "1":
//                        if (peru.getBookedSeats() + 1 < peru.getCapacity()){
//                            int countPeru = peru.getCapacity();
//                            peru.setCapacity(++countPeru);
//                            FlightCountry country = countryPeru;
//                            passengerService.enterPassengerDetailsPeru();
//                            System.out.println("");
//                            System.out.println("Your flight to " + country + " is confirmed!");
//                            System.out.println("");
//                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");
//
//                        } else System.out.println("Unable to book, plane is full! You missed out on Peru's 3000 variety potatoes.");
//                        System.out.println("");
//                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
//                        String option = scanner.nextLine();
//                        switch (option) {
//                            case "1":
//                                displayFlights();
//                                break;
//
//                            case "2":
//                                break;
//
//                        }
//
//                        break;
//
//                    case "2":
//                        displayFlights();
//                        break;
//                }
//                break;
//
//            case "2":
//                System.out.println("Flight Name: " + madagascar.getFlightName().toString() + "\n" + "Description: " + madagascar.getFlightDescription().toString() + "\n" + "Price: £" + madagascar.getPrice().toString());
//
//                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
//                String choice2 = scanner.nextLine();
//                switch (choice2) {
//
//                    case "1":
//                        if (madagascar.getBookedSeats() + 1 < madagascar.getCapacity()){
//                            int countMadagascar = peru.getCapacity();
//                            madagascar.setCapacity(++countMadagascar);
//                            FlightCountry country = countryMadagascar;
//                            passengerService.enterPassengerDetailsMadagascar();
//                            System.out.println("");
//                            System.out.println("Your flight to " + country + " is confirmed!");
//                            System.out.println("");
//                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");
//                        } else System.out.println("Plane fully booked! You can no longer mingle with Madagascar's Malagasy giant rat!");
//                        System.out.println("");
//                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
//                        String option = scanner.nextLine();
//                        switch (option) {
//                            case "1":
//                                displayFlights();
//                                break;
//
//                            case "2":
//                                break;
//
//                        }
//                        break;
//
//                    case "2":
//                        flightBookingService.displayFlights();
//                        break;
//
//                }
//                break;
//
//            case "3":
//                System.out.println("Flight Name: " + saudi.getFlightName().toString()+ "\n" + "Description: " + saudi.getFlightDescription().toString() + "\n" + "Price: £" + saudi.getPrice().toString());
//
//                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
//                String choice3 = scanner.nextLine();
//                switch (choice3) {
//
//                    case "1":
//                        if (saudi.getBookedSeats() + 1 < saudi.getCapacity()){
//                            int count = saudi.getCapacity();
//                            saudi.setCapacity(++count);
//                            FlightCountry country = countrySaudi;
//                            passengerService.enterPassengerDetailsSaudi();
//                            System.out.println("");
//                            System.out.println("Your flight to " + country + " is confirmed!");
//                            System.out.println("");
//                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");
//                        } else System.out.println("Plane fully booked! Can't taste no Arabian delights. Hah, sucks to be you!");
//
//                        System.out.println("");
//                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
//                        String option = scanner.nextLine();
//                        switch (option) {
//                            case "1":
//                                flightBookingService.displayFlights();
//                                break;
//
//                            case "2":
//                                break;
//
//                        }
//                        break;
//
//                    case "2":
//                        flightBookingService.displayFlights();
//                        break;
//                }
//                break;
//
//            case "4":
//                System.out.println("Flight Name: " + australia.getFlightName().toString() + "\n" + "Description: " + australia.getFlightDescription().toString() + "\n" + "Price: £" + australia.getPrice().toString());
//
//                System.out.println("\n Option 1: Book Now \n Option 2: Go Back");
//                String choice4 = scanner.nextLine();
//                switch (choice4) {
//
//                    case "1":
//                        if (australia.getBookedSeats() + 1 < australia.getCapacity()){
//                            int countAustralia = australia.getCapacity();
//                            australia.setCapacity(++countAustralia);
//                            FlightCountry country = countryAustralia;
//                            passengerService.enterPassengerDetailsAustralia();
//                            System.out.println("");
//                            System.out.println("Your flight to " + country + " is confirmed!");
//                            System.out.println("");
//                            System.out.println("Thank you for taking part in the Psychedelic Airlines Experience!");
//                        } else System.out.println("Plane fully booked! No surfing those beautiful sandy waves for you!");
//
//                        System.out.println("");
//                        System.out.println("\n Option 1: Book another flight. \n Option 2: Cancel");
//                        String option = scanner.nextLine();
//                        switch (option) {
//                            case "1":
//                                flightBookingService.displayFlights();
//                                break;
//
//                            case "2":
//                                break;
//
//                        }
//                        break;
//
//                    case "2":
//                        flightBookingService.displayFlights();
//                        break;
//                }
//                break;
//
//    }
//
//    
//        }
//
//        @Override
//        public void addToList(Object object){
//             addFlightToList.add(object);
//        }
//
//        @Override
//        public void deleteFromList(Object object){
//            addFlightToList.remove(object);
//        }
//
//
//
//    public FlightCountry getCountryPeru() {
//        return countryPeru;
//    }
//
//    public void setCountryPeru(FlightCountry countryPeru) {
//        FlightBookingService.countryPeru = countryPeru;
//    }
//
//    public FlightCountry getCountryMadagascar() {
//        return countryMadagascar;
//    }
//
//    public void setCountryMadagascar(FlightCountry countryMadagascar) {
//        FlightBookingService.countryMadagascar = countryMadagascar;
//    }
//
//    public FlightCountry getCountrySaudi() {
//        return countrySaudi;
//    }
//
//    public void setCountrySaudi(FlightCountry countrySaudi) {
//        FlightBookingService.countrySaudi = countrySaudi;
//    }
//
//    public FlightCountry getCountryAustralia() {
//        return countryAustralia;
//    }
//
//    public void setCountryAustralia(FlightCountry countryAustralia) {
//        FlightBookingService.countryAustralia = countryAustralia;
//    }
//}



