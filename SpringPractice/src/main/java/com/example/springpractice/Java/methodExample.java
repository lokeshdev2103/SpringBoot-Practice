package com.example.springpractice.Java;

class Mathoperations {
    int add(int a,int b){
        System.out.println(a+b);
        return a+b;
    }
    int sub(int a,int b){
        System.out.println(a-b);
        return a-b;
    }
}
public class methodExample {
    public static void main(String[] args){
        Mathoperations m1 = new Mathoperations();
        m1.add(3,5);
        m1.sub(3,10);
    }
}
