package com.bridgelabz.assignment;

import java.util.Scanner;

public class QuotieontRemainder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the divisor number");
        float divisor = sc.nextFloat();
        System.out.println("enter the dividend number");
        float dividend = sc.nextFloat();


        //calculate quotient & remainder
        float quotient = (dividend/divisor);
        System.out.println("Quotieont: " + quotient);
        float remainder = (dividend%divisor);
        System.out.println("reaimnder: " + remainder);


    }
}
