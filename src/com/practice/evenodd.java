package com.demo;

public class evenodd {
    public static void main(String[] args) {
        int [] num ={10,15,35,20,22,36,32,41,62,70};

        for (int n : num ){
            if (n%2!=0)
                System.out.println(n);
        }
    }
}
