package com.features.java9;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsExample {

    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        Arrays.stream(products).forEach(System.out::println);
    }
    public static void main(String[] args) {
        SafeVarArgsExample safeVarArgsExample = new SafeVarArgsExample();
        safeVarArgsExample.display(List.of("ratna","lilly","dev","maha"));
    }
}
