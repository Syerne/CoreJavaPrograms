package com.bridgelabz.assignment;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //user input for year
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("enter year in YYYY formate");
            int year = sc.nextInt();
            System.out.println("Your enter year is: " + year);

            //check year is in 4 digit number
            if (year > 999 && year <= 9999) {

                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("it is leap year");
                } else System.out.println("not a leap year");
            }
            break;
        }
    }
}