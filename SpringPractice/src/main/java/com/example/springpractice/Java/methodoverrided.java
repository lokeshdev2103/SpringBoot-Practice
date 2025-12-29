package com.example.springpractice.Java;
// Method overriding means a child class provides its own implementation of a method that is already defined in the parent class.

// method overrided is called as polymorphism runtime


// polymorphism : Ablity to  prevent the same interface for different data types
// Type1 : compile time --> method overloading
// Type2 : runtime ---> method override

// final key word: if i use final key for any class or any method so we can override the method or class

import java.util.Scanner;

// Parent class
class Notification {
    void sound() {
        System.out.println("Message is sent");
    }
}

// Child class - Email
class EmailNotification extends Notification {
    void sound() {
        System.out.println("Email Notification is sent");
    }
}

// Child class - SMS
class SmsNotification extends Notification {
    void sound() {
        System.out.println("SMS Notification is sent");
    }
}

public class methodoverrided {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Notification Type:");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");

        int choice = scanner.nextInt();

        if (choice == 1) {
            Notification n1 = new EmailNotification();
            n1.sound();
        } else if (choice == 2) {
            Notification n1 = new SmsNotification();
            n1.sound();
        } else {
            System.out.println("Invalid choice");
            return;
        }
 // Runtime polymorphism
        scanner.close();
    }
}

