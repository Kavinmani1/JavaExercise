package com.demo;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        try {
            System.out.println(num.length);
            System.out.println(10/0);
            System.out.println("number at index 3 is" + num[3]);
            System.out.println("number at index 3 is" + num[6]);
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception exe) {
            System.out.println("Exception caught" + exe.getMessage());
            exe.printStackTrace();
        }
        System.out.println("program executed correctly");
    }
}
