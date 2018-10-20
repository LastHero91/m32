package com.k381;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str[] = new String[10];
        Arrays.stream(str).forEach(System.out::println);
        System.out.print("Hello!");
    }
}
