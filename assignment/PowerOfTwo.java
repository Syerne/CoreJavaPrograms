package com.bridgelabz.assignment;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner wel = new Scanner(System.in);
        System.out.println("enter power for number");
        int N = wel.nextInt();

        int power = 1;
        for(int i = 1; i <= N ; i++ ) {
            power = (2 * power);
            System.out.println(power);
        }
    }
}
