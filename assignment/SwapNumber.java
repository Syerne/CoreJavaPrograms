package com.bridgelabz.assignment;

import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int x = sc.nextInt();
        System.out.println("enter 2nd number");
        int y = sc.nextInt();

        System.out.println("before swapping numbers are: " + "x=" + x + "\t" + "y=" + y  );

        int temp = x;
        x=y;
        y=temp;

        System.out.println("after swapping numbers are: " + "x=" + x + "\t" + "y=" + y  );

    }
}
