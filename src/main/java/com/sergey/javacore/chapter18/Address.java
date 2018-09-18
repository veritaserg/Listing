package com.sergey.javacore.chapter18;

import java.util.LinkedList;
import java.util.RandomAccess;

public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}

class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();
        ml.add(new Address("Ivanov", "Lenina", "Poltava", "UK", "6821"));
        ml.add(new Address("Petrov", "Petti", "Stambul", "TU", "343434"));
        for (Address element : ml) {
            System.out.println(element + "\n");
        }


    }
}
