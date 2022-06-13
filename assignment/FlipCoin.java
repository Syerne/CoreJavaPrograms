package com.bridgelabz.assignment;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number how many time you want to flip the coin");
        int positiveNum = sc.nextInt();

        // check user input is positive number or not
        if (positiveNum > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("not positive number; enter again");
        }
        // play upto user input
        float headCount = 0; // local variable for count
        float count = 0;
       float tailCount=0;
        for (int i = 1; i <= positiveNum; i++) {

            float randomcheck = (float) Math.random();// random number generate

            if (randomcheck > 0.5) {
                headCount++;
               // System.out.println("Head");

            } else {
                //System.out.println("Tail");
                tailCount++;
            }
        }
        System.out.println("Head" + headCount);

        System.out.println("Tail" + tailCount);
        double headP = (( headCount/ positiveNum ) * 100);
        System.out.println("HeadPercentage: " + headP + "%" );
        double TailCount = (( (positiveNum - headCount) / positiveNum) * 100);
        System.out.println("TailPercentage" + TailCount + "%");

    }
}
