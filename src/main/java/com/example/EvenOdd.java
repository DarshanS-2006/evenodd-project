package com.example;

public class EvenOdd {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String check(int number) {
        return isEven(number) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int n = args.length > 0 ? Integer.parseInt(args[0]) : 10;
        System.out.println(n + " is " + check(n));
    }
}
