package com.practice;
import java.util.Scanner;

public class Primenumber
{
    public static void main(String[] args)
    {
        int num= 6, i=2, count=0;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        num = s.nextInt();

        while(i<num)
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
            i++;
        }

        if(count==0)
            System.out.println("\n" +num+ " is a Prime Number.");
        else
            System.out.println("\n" +num+ " is not a Prime Number.");
    }
}

