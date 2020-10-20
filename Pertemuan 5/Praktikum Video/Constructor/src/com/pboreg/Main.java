package com.pboreg;

// class tanpa contrucstor / class polos
class Polos{
    String dataString;
    int dataInteger;
}

// class dengan constructor
class Mahasiswa{
    String nama;
    String NIM;
    String jurusan;

    //constructor dipanggil saat object pertama kali dibuat
    //Mahasiswa(){
    //     System.out.println("Ini adalah constructor");
    //}

    // constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan){
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {

    public static void main(String[] args) throws Exception{

        Mahasiswa mahasiswa1 = new Mahasiswa("ucup", "2019071010", "teknik informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("otong", "2019071011", "management");
        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa2.nama);

        //Polos objectPolos = new Polos();
        //objectPolos.dataString = "polos";
        //objectPolos.dataInteger = 0;

        //System.out.println(objectPolos.dataString);
        //System.out.println(objectPolos.dataInteger);
    }
}
