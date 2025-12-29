package com.example.springpractice.Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Functional Interface
@FunctionalInterface
interface Printer {
    void print(String value);
}

public class lamdbaAndInterface {

    public static void main(String[] args) {

        // List
        List<String> list = new ArrayList<>();
        list.add("Lokesh");

        // Set (duplicates removed automatically)
        Set<String> set = new HashSet<>();
        set.add("Loki");
        set.add("Lokesh");
        set.add("Lokesh");

        // Lambda implementation
        Printer printer = value -> System.out.println(value);

        // Using lambda with List
        list.forEach(printer::print);

        // Using lambda with Set
        set.forEach(printer::print);
    }
}
