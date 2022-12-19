package com.features.java9;

public class VersionInfoExample {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println(version);
        System.out.println(version.major());
        System.out.println(version.minor());
        System.out.println(version.security());
        System.out.println(version.patch());
        System.out.println(version.version());

    }
}
