package com.bridgelabz.assignment;

import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter any small or capital letter");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

        System.out.println("vowel");
    }else if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
            System.out.println("consonant");
        }else System.out.println("not a alphabets");

    }
}
