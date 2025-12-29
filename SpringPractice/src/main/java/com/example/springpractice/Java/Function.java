package com.example.springpractice.Java;

@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}
