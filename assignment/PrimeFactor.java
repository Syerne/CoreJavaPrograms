package com.bridgelabz.assignment;

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for primefactor:");
        float N = sc.nextFloat();

        for(int divisor = 2 ; divisor <= N ; divisor++){
            while(N % divisor == 0){
                N = N / divisor;
                System.out.println(divisor + "/" + N);
            }
        }
    }
}
