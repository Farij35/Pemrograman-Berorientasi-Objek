package com.pboreg;

import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Toyota");
        cars.add("Suzuki");
        cars.add("Honda");
        cars.add("Nissan");
        cars.add("Muling");
//        for(int i = 0; i < cars.size(); i++){
//            System.out.println(cars.get(i));
//        }

        for(String i:cars){
            System.out.println(i);
        }
    }
}
