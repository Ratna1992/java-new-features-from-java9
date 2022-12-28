package com.features.java9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TakeWhileStreamExample {
    public static void main(String[] args) {
        //takeWhile() doesn't return anything if predicate fails
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8).takeWhile(elm -> elm % 2 == 0).
                collect(Collectors.toList()).forEach(System.out::println);

        //takeWhile()  returns  if predicate success only
        List<Integer> collect = Stream.of(2, 4, 6, 8).takeWhile(elm -> elm % 2 == 0).
                collect(Collectors.toList());
        System.out.println(collect);

        //takeWhile()  returns   first 2 elms since it is true
        List<Integer> list
                = Stream.of(2,2,3,4,5,6,7,8,9,10)
                .takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
        System.out.println(list);
    }
}
