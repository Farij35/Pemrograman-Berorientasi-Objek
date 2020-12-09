package com.pboreg;

class MultiCathBlock {
    public static void main(String[] args) {
        try{
            int array[] = new int[10];
            array[10] = 10 / 0;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
