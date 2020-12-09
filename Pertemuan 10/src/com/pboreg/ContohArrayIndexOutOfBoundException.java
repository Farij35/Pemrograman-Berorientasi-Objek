package com.pboreg;

public class ContohArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        try{
            int b[] = {20,20,40};
            System.out.println("Nilai : " + b[2]);

            int angka = 7;
            int hasil = angka/2;
            System.out.println(hasil);
        } catch (ArithmeticException e) {
            System.out.println("Tidak boleh membagi sebuah bilangan dengan nol");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Data array yang ingin ditampilkan tidak ada");
        } finally {
            System.out.println("Pesan ini dicetak");
        }
        System.out.println("Terima Kasih");
    }
}
