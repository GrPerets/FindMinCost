package com.grperets.city;

import java.util.ArrayList;
import java.util.HashMap;

public class City {
    private int id;
    private String name;
    private int neighbors;
    private HashMap<Integer, Integer> costMap;

    public City (int id, String name, int neighbors){
        this.id = id;
        this.name = name;
        this.neighbors = neighbors;
        this.costMap = new HashMap<>();
    }

    public City(int id,String name, int neighbors, HashMap<Integer, Integer> costMap){
        this(id, name, neighbors);
        this.costMap = costMap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(int neighbors) {
        this.neighbors = neighbors;
    }

    public HashMap<Integer, Integer> getCostMap() {
        return costMap;
    }

    public void setCostMap(HashMap<Integer, Integer> costMap) {
        this.costMap = costMap;
    }

    public int put(int neighbor, int cost){
        costMap.put(neighbor, cost);
        return cost;
    }

    public static City findCityById(int id, ArrayList<City> cities){
        for(City city : cities){
            if(city.getId() == id){
                return city;
            }
        }
        return null;
    }

    public static City findCityByName(String name, ArrayList<City> cities){
        for(City city: cities){
            if (city.getName().equals(name)) {
                return city;
            }
        }
        return null;
    }
}
