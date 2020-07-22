package com.grperets.trip;

public class Trip {
    private int totalCost;

    public Trip(){}

    public Trip(int totalCost){
        this.totalCost = totalCost;
    }

    public Trip(Trip previousTrip){
        this.totalCost = previousTrip.getTotalCost();
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public void addCost(int ticket){
        this.totalCost += ticket;
    }


}
