package com.practice;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
public class Filereaderdemo {
    public static void main(String[] args) {
        try{
            FileReader fr =new FileReader("src/com/practice/new1.txt");//it is throwing file niot found exception
            System.out.println("reading");
            int i;
            while ((i=fr.read()) !=-1)//ehen ever it reaches the end of line
                System.out.print((char)i);
            fr.close();
        }catch (FileNotFoundException fe){
            System.out.println("Filenotfound:"+fe.getMessage());
        }catch (IOException ie){
            System.out.println("Ioexception:"+ie.getMessage());
        }
    }
}
