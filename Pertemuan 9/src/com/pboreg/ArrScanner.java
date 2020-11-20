package com.pboreg;

import java.util.Scanner;
import java.util.*;

class ContohArray2{
    private int[] angka;
    public ContohArray2(int jmlData){
        angka = new int[jmlData];
    }

    public void viewAll(){
        System.out.println("View All For");
        for(int i=0; i < this.angka.length; i++){
            System.out.println("Nilai " + (i+1) + "= " +
                    this.angka[i]);
        }
    }

    public void setAngka(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data");
        for(int i = 0; i < this.angka.length; i++){
            System.out.println("Nilai " + (i+1) + "= ");
            this.angka[i] = sc.nextInt();
        }
    }
}

public class ArrScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Bilangan : ");
        int jmlBil =  sc.nextInt();
        ContohArray2 arrA = new ContohArray2(jmlBil);
        arrA.setAngka();
        arrA.viewAll();
    }
}
