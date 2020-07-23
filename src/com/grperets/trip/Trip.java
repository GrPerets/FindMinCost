package com.grperets.trip;

import com.grperets.city.City;
import java.util.ArrayList;

public class Trip {
    private int totalCost;
    private ArrayList<City> visitedCities;

    public Trip(){
        this.visitedCities = new ArrayList<>();
    }

    public Trip(Trip previousTrip) {
        this.totalCost = previousTrip.getTotalCost();
        this.visitedCities = new ArrayList<>(previousTrip.getVisitedCities());
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }


    public ArrayList<City> getVisitedCities() {
        return visitedCities;
    }

    public void setVisitedCities(ArrayList<City> cities) {
        this.visitedCities = cities;
    }

    public void addCost(int ticket){
        this.totalCost += ticket;
    }

    public void addCity (City city) {
        this.visitedCities.add(city);
    }

}
