package com.pboreg;

class Array {
    private int[] angka = {15, 5, 35, 45, 25, 55};

    public void viewAllManual() {
        //sebut datanya satu-satu berdasarkan indexnya
        System.out.println("\nView All Manual");
        System.out.println("Nilai 1 = " + this.angka[0]);
        System.out.println("Nilai 2 = " + this.angka[1]);
        System.out.println("Nilai 3 = " + this.angka[2]);
        System.out.println("Nilai 4 = " + this.angka[3]);
        System.out.println("Nilai 5 = " + this.angka[4]);
        System.out.println("Nilai 6 = " + this.angka[5]);
    }

    public void viewAllFor(){
        System.out.println("\nView All For");
        for(int i=0; i < this.angka.length; i++){
            System.out.println("Nilai " + (i+1) + "= " +
                    this.angka[i]);
        }
    }

    public void viewAllWhile(){
        System.out.println("\nView All While");
        //inisialisasi
        int i=0;
        while(i < this.angka.length){
            System.out.println("Nilai " + (i+1) + "= " +
                    this.angka[i]);
            i++;
        }
    }

    public void viewByID(int i){
        System.out.println("\nView By Index");
        System.out.println("Nilai " + (i+1) + "= " +
                this.angka[i]);
    }

    public void totalData(){
        //{15, 5, 35, 45, 25, 55};
        System.out.println("\nTotal Data: ");
        int total = 0;
        for(int i=0; i < this.angka.length; i++){
            total = total + this.angka[i];
        }
        System.out.println(total);
        System.out.println("\nYang dihitung dari banyaknya data = " +
                this.angka.length);
    }

    public void rataRata(){
        double rRata;
        System.out.println("\nRata-rata : ");
        double total = 0;
        for(int i=0; i < this.angka.length; i++){
            total = total + this.angka[i];
        }
        rRata = total / this.angka.length;
        System.out.println(String.format("%.2f",rRata));
    }
}

public class Main {

    public static void main(String[] args) {
        Array objArrA = new Array();
        objArrA.viewAllManual();
        objArrA.viewAllWhile();
        objArrA.viewAllFor();
        objArrA.viewByID(2);
        objArrA.totalData();
        objArrA.rataRata();
    }
}
