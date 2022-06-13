package com.bridgelabz.assignment;

public class FibonacciSeries1 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println("Before Fibonacci: " + "a:" + a + " " + "b: " + b);
        for (int i = 1; i <= 10; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;

        }

    }

}


