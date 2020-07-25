package com.grperets.resource;

import com.grperets.city.City;

import java.io.*;
import java.util.ArrayList;

public class CitiesList {

    /**
     *This method
     *
     * Returns a CitiesList from the source (file on disk)
     *
     * @param input This is the path to the cities file
     * @return This is the cities list
     */

    public static ArrayList<City> citiesFromFile(String input){
        File inputFile = new File(input);
        ArrayList<City> cities = new ArrayList<>();
        City city = null;
        String cityInfo = null;
        try (BufferedReader bRead = new BufferedReader(new FileReader(inputFile))){
            while ((cityInfo = bRead.readLine()) != null){
                String[] cityInfoArr = cityInfo.split(" ");
                city = new City(Integer.valueOf(cityInfoArr[0]), cityInfoArr[1], Integer.valueOf(cityInfoArr[2]));
                int b = 0;
                for (int i=0;i<city.getNeighbors();i++){
                    city.put(Integer.valueOf(cityInfoArr[3+b]), Integer.valueOf(cityInfoArr[4+b]));
                    b = b+2;
                }
                cities.add(city);
            }

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        return cities;
    }
}
