package com.example.springpractice.Java;
import java.util.*;
public class collections {
    public static void main(String[] args) {

        // LIST - Cart
        List<String> cart = new ArrayList<>();
        cart.add("Pizza");
        cart.add("Burger");
        cart.add("Pizza");

        // SET - Unique Restaurants
        Set<String> restaurants = new HashSet<>();
        restaurants.add("Dominos");
        restaurants.add("KFC");
        restaurants.add("Dominos");

        // MAP - Order details
        Map<Integer, String> orders = new HashMap<>();
        orders.put(1001, "Pizza + Burger");
        orders.put(1002, "Burger");

        // QUEUE - Order processing
        Queue<Integer> orderQueue = new LinkedList<>();
        orderQueue.offer(1001);
        orderQueue.offer(1002);

        // Output
        System.out.println("Cart: " + cart);
        System.out.println("Restaurants: " + restaurants);
        System.out.println("Orders: " + orders);
        System.out.println("Processing Order: " + orderQueue.poll());
    }
}
