package com.example.springpractice.Java;

public class exceptionHanding {
    public static void main(String[] args){
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e){
            System.out.println("10 cannot divide by zero");
        } finally {
            System.out.println("Done with the excution ");
        }
    }
}
