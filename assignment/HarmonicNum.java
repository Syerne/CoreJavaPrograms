package com.bridgelabz.assignment;

import java.util.Scanner;

public class HarmonicNum {
    public static void main(String[] args) {

        Scanner har = new Scanner(System.in);
        System.out.println("enter number for harmonic number");
        int N = har.nextInt();


        float result = 0.0f;
      String start = "1/1" ;
        for(int i = 2; i <= N ; i++){
          start = (start + " + " + "1/" + i );
      }
        System.out.println("Harmonic series is: " + start);

 }
}
