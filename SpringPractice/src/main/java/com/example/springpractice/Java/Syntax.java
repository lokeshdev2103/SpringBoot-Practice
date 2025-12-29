package com.example.springpractice.Java;

class Student {
    int id;
    String name;
    void display(){
        System.out.println(id + " " + name);
    }
}

public class Syntax {



    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] numbers = {20, 30, 40, 50, 60};

        int thirdNumber = numbers[2];
        System.out.println(thirdNumber);

        for (int num : numbers) {
            if (num <= 40) {
                System.out.println(num + " is <= 40");
            } else {
                System.out.println(num + " is > 40");
            }
        }

        Student s1 = new Student();
        s1.id = 100;
        s1.name  = "lokesh";
        s1.display();

    }
}
