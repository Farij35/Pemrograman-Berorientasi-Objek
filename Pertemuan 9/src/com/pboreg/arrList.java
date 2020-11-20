package com.pboreg;

import java.util.ArrayList;

public class arrList {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.set(0,"Opel");
        System.out.println(cars);
        cars.remove(0);
        System.out.println(cars);
        cars.clear();
        System.out.println(cars);
        cars.size();
    }
}
