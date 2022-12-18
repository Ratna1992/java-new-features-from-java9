package com.features.java9;

import java.util.Set;

public class FactoryMethodSetExample {
    public static void main(String[] args) {
        Set<String> set = Set.of("ratna", "lilly", "dev","sri");
        set.forEach(System.out::println);
    }
}
