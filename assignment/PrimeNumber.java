package com.bridgelabz.assignment;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any positive number");
        int num = sc.nextInt();

        int isprime = 1;
        for (int div = 2; div <= (num - 1); div++) {
            if (num % div == 0) {
                isprime = 0;
                break;
            }
        }
        if (isprime == 1) {
            System.out.println(num + "is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }


    }
}

