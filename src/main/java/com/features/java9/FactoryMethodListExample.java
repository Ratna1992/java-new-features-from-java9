package com.features.java9;

import java.util.List;

public class FactoryMethodListExample {
    public static void main(String[] args) {
        List<String> stringList = List.of("ratna", "lilly", "dev", "sri");
        stringList.forEach(System.out::println);
    }
}
