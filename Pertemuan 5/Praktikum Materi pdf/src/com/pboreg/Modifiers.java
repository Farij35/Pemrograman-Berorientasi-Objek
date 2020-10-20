package com.pboreg;

// Code from filename : Person.java
// abstract class

abstract class Person {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); // abstract method
}

class Student extends Person {
    public int graduationYear = 2018;
    public void study(){
        System.out.println("Studying all day long");
    }
}
// End code from filename : Person.java

// Code from filename : MyClass3.java
class MyClass3{
    public static void main(String[] args) {
        //create an object of the student class (which inherits attributes and methods from person)
        Student myObj = new Student();

        System.out.println("Name : " + myObj.fname);
        System.out.println("Age : " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call an abstract method
    }
}