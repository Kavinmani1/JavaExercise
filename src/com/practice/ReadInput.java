package com.workout;

import java.util.Scanner;

public class ReadInput {
    public static String read(){
        Scanner sn=new Scanner(System.in);
        System.out.println("Input expression");
        String iline=sn.nextLine();
        sn.close();
        return iline;
    }
}
