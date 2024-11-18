package org.example.Task3;

public class Main {
    public static void main(String[] args) {
        ExtendedPerson person = new ExtendedPerson("Madison","Cooper", 22, "Spain");

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

        person.setAge(23);
        person.setCountry("Austria");

        System.out.println("Updated Age: " + person.getAge());
        System.out.println("Updated Country: " + person.getCountry());
    }
}