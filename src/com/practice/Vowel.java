package com.practice;

import java.util.Scanner;

    public class Vowel
    {
        public static void main(String[] args)
        {
            char ch;
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter an Alphabet: ");
            ch = scan.next().charAt(0);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                System.out.println("\nIt is a Vowel.");
            else
                System.out.println("\nIt is a Consonant.");
        }
    }

