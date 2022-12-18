package com.features.java9;

import java.util.Map;

public class FactoryMethodMapExample {
    public static void main(String[] args) {
        Map<String, String> stringMap = Map.of("name1", "ratna", "name2", "lilly", "name3", "dev", "name4", "sri");
        stringMap.forEach((k, v) -> System.out.println(k + " " + v));
        Map.Entry<Integer, String> e1 = Map.entry(101, "Java");
        Map.Entry<Integer, String> e2 = Map.entry(102, "Spring");
        // Creating Map using map entries
        Map<Integer, String> map = Map.ofEntries(e1,e2);
        map.forEach((k,v)-> System.out.println(k + " " + v));
    }
}
