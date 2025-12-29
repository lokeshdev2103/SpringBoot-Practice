package com.example.springpractice.Java;


abstract class Animal {              // abstract class
    abstract void makeSound();       // abstract method
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meow");
    }
}


public class abstractMethodandClass {
    public static void main(String[] args){
        Animal a= new Dog();
        a.makeSound();

        Animal c = new Cat();
        c.makeSound();
    }

}
