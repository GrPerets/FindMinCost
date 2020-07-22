package com.grperets.main;

import com.grperets.resource.CitiesMap;

public class Main {
    public static void main(String[] args){
        System.out.println(CitiesMap.citiesFromFile("resources/cities.txt"));
    }
}
