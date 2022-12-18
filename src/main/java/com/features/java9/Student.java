package com.features.java9;

public class Student implements College{
    public static void main(String[] args) {
        College college = new Student();
        System.out.println(college.getCollegeDetails());
    }
}
