package com.bridgelabz.assignment;

import java.util.Scanner;

public class Day5FlipCoin {
    public static void main(String[] args) {
        int num = 0;
        int positiveNum = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter positive int num for play flip the coin");
            positiveNum = sc.nextInt();
            if(positiveNum > 0){
                System.out.println("it is a positive number:" + positiveNum);
            }
            System.out.println(positiveNum);
            float randomNum = (float) Math.random();
            System.out.println(randomNum);
            if (randomNum < 0.5) {
                System.out.println("Tail");
            } else {
                System.out.println("Head");
            }
        } while (num != positiveNum);

    }

}