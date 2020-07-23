package com.grperets.main;

import com.grperets.city.City;
import com.grperets.resource.CitiesList;
import com.grperets.travelagency.TravelAgency;
import com.grperets.trip.Trip;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        /*
        if you want to enter data from the keyboard, please wait the code will be later
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Return the start city: ");
        String start = scanner.nextLine();
        System.out.print("Return the finish city: ");
        String finish = scanner.nextLine();



        // Connect and download cities list
        /* If you want to add a new city, make changes to the file "resources/cities.txt"
        */

        ArrayList<City> cities = CitiesList.citiesFromFile("resources/cities.txt");

       /*
        String start = "gdansk";
        String finish = "warszawa";
        */


        //Create new object Trip and checks start-city

        Trip newTrip = new Trip();
        newTrip.addCity(City.findCityByName(start, cities));


        //Create new Object Travel

        TravelAgency travelAgency = new TravelAgency(cities);
        travelAgency.addTrip(start, finish, newTrip);

        //Output of information to the console
        travelAgency.minCost();




        // Full info travel
        /*
        int i = 0;
        for (Trip trip:travelAgency.getTrips()){
            i++;
            System.out.println("Trip #"+i);
            System.out.printf("Cost : %d\n", trip.getTotalCost());
            for (City city:trip.getVisitedCities()){
                System.out.printf("%s ",city.getName());
            }
            System.out.println();

        }
         */


    }
}
