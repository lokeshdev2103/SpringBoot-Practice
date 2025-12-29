package com.example.springpractice.Java;

import java.util.UUID;
import java.util.function.Function;

public class exampleInterface {
   public static  void main (String[] args){
       Predicate<Integer> isAdult = age -> age >= 18;
       boolean result = isAdult.test(20);
       System.out.println(result);

       Function<String, String> toUpper = s -> s.toUpperCase();
       String result1 = toUpper.apply("Lokesh");
       System.out.println(result1);

       consumerAction<String> logger = msg -> System.out.println(msg);
       logger.accept("I Love You ");

       suppilerToken<String> token = () -> UUID.randomUUID().toString();
       String result3 = token.get();
       System.out.println(result3);
   }
}
