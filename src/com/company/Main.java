package com.company;

public class Main {

    public static void main(String[] args) {
    Person person1=new Person();
    Person person2=new Person("Vladimir",30);
        System.out.print(person1.fullName+" ");
        person1.speak();
        System.out.print(person1.fullName+" ");
        person1.move();
        System.out.print(person2.fullName+" ");
        person2.speak();
        System.out.print(person2.fullName+" ");
        person2.move();



    }
}
