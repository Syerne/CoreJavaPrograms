package com.bridgelabz.assignment;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        //taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of time you want to flip-");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("positive number");
        } else
            System.out.println("please enter positive number");

        //Initialising variable that counts number of head and tail
        float headCount = 0;
        float tailCount = 0;

        for (int i = 1; i <= num; i++) {

            float randomCheck = (float) (Math.random()); //generating number [0 to 1]
            if (randomCheck < 0.5) {
                headCount++;
            } else {
                tailCount++;
            }
        }

        //Percentage computation
        float headPercent = (headCount / num) * 100;
        System.out.println("Head% - " + headPercent + "%");
        float tailPercent = (tailCount / num) * 100;
        System.out.println("Tail% - " + tailPercent + "%");
    }
}
