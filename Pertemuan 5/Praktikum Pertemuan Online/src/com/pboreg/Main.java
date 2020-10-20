package com.pboreg;

public class Main {

    public static void main(String[] args) {
        bilangan obil = new bilangan();
        System.out.println("Nilai A = " + obil.tampilkanA());
        System.out.println("Nilai B = " + obil.tampilkanB());
        System.out.println("Nilai C = " + obil.tampilkanC());

        //nilai A diinput
        obil.inputA(100);
        System.out.println("Nilai A setelah diinput = " + obil.tampilkanA());

        //nilai B diinput
        obil.inputB(200);
        System.out.println("Nilai B setelah diinput = " + obil.tampilkanB());

        //nilai C diinput
        obil.inputC(300);
        System.out.println("Nilai C setelah diinput = " + obil.tampilkanC());

        //panggil method tambah
        System.out.println("Hasil Pertambahan = " + obil.tambah());

        //panggil method kurang
        System.out.println("Hasil Pengurangan = " + obil.kurang());

        //panggil method kali
        System.out.println("Hasil Perkalian = " + obil.kali());

        //panggil method bagi
        System.out.println("Hasil Pembagian = " + obil.bagi());

        //panggil method input data
        obil.inputData(3, 5, 2);
        System.out.println("Hasil pertambahan = " + obil.tambah());
    }
}
