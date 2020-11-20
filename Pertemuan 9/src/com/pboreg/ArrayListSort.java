package com.pboreg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Suzuki");
        cars.add("Honda");
        cars.add("Nissan");
        cars.add("Muling");
        Collections.sort(cars);
        for(String i:cars){
            System.out.println(i);
        }
    }
}
