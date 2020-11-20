package com.pboreg;

import java.util.ArrayList;
import java.util.Collections;

public class AlSortInt {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(20);
        myNumbers.add(25);
        myNumbers.add(30);
        myNumbers.add(35);
        myNumbers.add(40);
        myNumbers.add(45);

        Collections.sort(myNumbers);

        for(int i:myNumbers){
            System.out.println(i);
        }
    }
}
