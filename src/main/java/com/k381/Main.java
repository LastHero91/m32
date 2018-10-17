package com.k381;

import com.google.common.collect.Lists;

public class Main {
    public static void main(String[] args) {
        //test(args.length == 1 ? args[0] : "No name");
        test(Lists.asList("Sully", args).toString());
    }

    private static void test(String name) {
        System.out.println("Hello " + name + "!\n"+System.getProperty("agr_prop", "Tester"));
    }
}
