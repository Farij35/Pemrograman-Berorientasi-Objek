package com.pboreg;

public class Main {

    public static void main(String[] args) {

        try {

            // code that generate exception
            int divideByZero = 5 / 1;
            System.out.println("Rest of code in try block");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException => " + e.getMessage());
        }

        finally {
            System.out.println("This is Finally Block");
        }

    }
}
