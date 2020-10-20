package com.pboreg;

public class Main {

    public static void main(String[] args) {
        biodata obil = new biodata();

        // input NIM
        obil.inputNIM("2019071010");
        System.out.println("NIM : " + obil.tampilkanNIM());

        // input Nama
        obil.inputNama("Farij Altaf Syah");
        System.out.println("Nama : " + obil.tampilkanNama());

        // input Jurusan
        obil.inputJurusan("Informatika");
        System.out.println("Jurusan : " + obil.tampilkanJurusan());

        // input Angkatan
        obil.inputAngkatan("2019");
        System.out.println("Angkatan : " + obil.tampilkanAngkatan());
    }
}
