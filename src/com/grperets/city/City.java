package com.grperets.city;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    public String findNameForId(int id, HashMap<String, City> cities){
        Set<Map.Entry<String, City>> citySet = cities.entrySet();
        for(Map.Entry<String, City> city : citySet){
            if(city.getValue().getId() == id){
                return city.getValue().getName();
            }
        }
        return null;
    }
}
