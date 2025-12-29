package com.example.springpractice.Java;

class Students {
    int id;
    String firstName;
    String lastName;
    String phone;

    void display() {
        System.out.println(id + " " + firstName + " " + lastName + " " + phone);
    }
}

public class ClassandObject {
    public static void main(String[] args) {
        Students s1 = new Students();

        s1.id = 100;
        s1.firstName = "Lokesh";
        s1.lastName = "Yalla";
        s1.phone = "7287872021";

        s1.display();
    }
}
