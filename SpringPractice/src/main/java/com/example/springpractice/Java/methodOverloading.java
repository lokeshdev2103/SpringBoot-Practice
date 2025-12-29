package com.example.springpractice.Java;

// mutiple methods with the same name but different parameters in the same class

class Calculator {

    int add(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }

    int add(int a, int b, int c) {
        System.out.println(a+b+c);
        return a + b + c;
    }

    double  add(double a, double b) {
        System.out.println(a+b);
        return a+b;
    }
}


public class methodOverloading {
    public static void main(String[] arg){
        Calculator c = new Calculator();
        c.add(3,5.6);
    }
}
