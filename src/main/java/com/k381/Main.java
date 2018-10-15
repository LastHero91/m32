package com.k381;

public class Main {
    public static void main(String[] args) {
        test(args.length == 1 ? args[0] : "No name!");
    }

    private static void test(String name) {
        System.out.println("Hello " + name + "!");
    }
}
