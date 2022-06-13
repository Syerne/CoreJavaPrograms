package com.bridgelabz.assignment;

import java.util.Scanner;

public class PerfectNumber {
    // perfect number means number divisor sum is euqal to>
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter positive number");
        int num = sc.nextInt();

        int sum = 0;
        for (int div = 1; div <= num / 2; div++) {
            if (num % div == 0) {
                System.out.println(div);
                sum = sum + div;
            }
        }
        if (num == sum) {
            System.out.println(num + " is a perfect number");
        } else
            System.out.println(num + "is not a perfect number");


    }
}
