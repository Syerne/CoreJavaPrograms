package com.bridgelabz.assignment;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int firstNum = sc.nextInt();
        System.out.println("enter 2nd number");
        int secondNum = sc.nextInt();
        System.out.println("enter 3rd number");
        int thirdNum = sc.nextInt();

        System.out.println("Three numbers are: " + firstNum + " " + secondNum + " " + thirdNum);

        if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println(firstNum + " 1st number largest as compared to others");
        } else if (secondNum > thirdNum && secondNum > firstNum) {
            System.out.println(secondNum + " 2nd number is largest as compared to others");
        } else System.out.println(thirdNum + " 3rd number is largest as compared to others");
    }
}
