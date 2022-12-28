package com.features.java9;

public interface InterfacePrivateMethods {
    default String getCollegeDetails() {
        System.out.println(getGreetings());
        return getCollegeName() + " " + getCollegeDepartments() + " " + getCollegeDepartments();
    }

    private String getCollegeName() {
        return "Ratna College of Engineering & Technology";
    }

    private String getCollegeDepartments() {
        return "CSE,IT";
    }

    private static String getGreetings() {
        return "Hello! Welcome Dear Below are the details of your college";
    }


}
