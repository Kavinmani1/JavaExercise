package com.practice;
import java.io.FileWriter;
import java.io.IOException;
public class Filewritterdemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("src/com/practice/new1.txt");
            fw.write("this is how i write the file");
            fw.close();
            System.out.println("sucessfully wrote the file");
        }catch(IOException e){
            System.out.println("Ioexception:"+e.getMessage());
        }
    }
}
