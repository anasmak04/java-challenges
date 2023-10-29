package org.example;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        FizzBuzz();
    }

    private static void FizzBuzz() {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FIZZBUZZ");
            } else if (i % 3 == 0) {
                list.add("FIZZ");
            } else if (i % 5 == 0) {
                list.add("BUZZ");
            } else {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}