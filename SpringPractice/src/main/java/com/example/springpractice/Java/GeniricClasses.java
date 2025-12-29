package com.example.springpractice.Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GeniricClasses {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Lokesh");

        Set<String> list1 = new HashSet<>();
        list1.add("Lalitesh");
        list1.add("Lokesh");
        list1.add("Lokesh"); // duplicate removed

        String name = list.get(0);

        // Correct iteration for Set
        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println(name);
    }
}
