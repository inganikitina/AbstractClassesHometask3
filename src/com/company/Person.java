package com.company;
public class Person {
    String fullName;
    int age;

    Person(){};
    Person(String fullName,int age){this.fullName=fullName;this.age=age;}
    public void move(){
        System.out.println("moves.");
    }
    public void speak(){
        System.out.println("speaks.");
    }
}
