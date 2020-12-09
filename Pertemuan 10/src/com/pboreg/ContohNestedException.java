package com.pboreg;

public class ContohNestedException {
    public static void main(String[] args) {
        try { //main try-block
            try { //try-block 2
                try { //try-block 3
                    int arrBil[] = {1, 2, 3, 4};

                    // Saya akan menampilkan array pada index diluar arrBil
                    System.out.println(arrBil[10]);
                } catch (ArithmeticException e) {
                    System.out.print("Arithmetic Exception ");
                    System.out.println("ditangani pada try-block3");
                }
            } catch (ArithmeticException e) {
                System.out.print("Arithmetic Exception ");
                System.out.println("ditangani pada try-block2");
            }
        } catch (ArithmeticException e) {
            System.out.print("Arithmetic Exception ");
            System.out.println("ditangani pada main try-block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("ArrayIndexOutOfBoundsException Exception ");
            System.out.println("ditangani pada main try-block");
        } catch (Exception e) { //Exception jika catch yang ditulis sebelumnya tidak dapat menangani
            System.out.println("Exception ");
            System.out.println("ditangani pada main try-block");
        }
    }
}
