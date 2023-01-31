package com.demo;

public class Arithmetic {
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b) {
        return a - b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args){
        Arithmetic ar = new Arithmetic();
        System.out.println("additino of 5,10 is" + ar.add(5,10));
        System.out.println("subtraction of 15,10 is" + ar.sub(15,10));
        System.out.println("multiplication of 2,3 is" + ar.multiply(2,3));
        System.out.println("divition of 10,2 is" + ar.divide(10,2));
    }
}
