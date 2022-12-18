package com.features.java9;

import java.util.ArrayList;
import java.util.List;

public class BeforeFactoryMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Java");
        list.add("JavaFX");
        list.add("Spring");
        list.add("Hibernate");
        list.add("JSP");
        for(String l : list){
            System.out.println(l);
        }
    }
}
