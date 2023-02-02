package com.practice;
import java.io.IOException;
import java.io.StringReader;

public class Stringreader1 {
    public static void main(String[] args) {
        try{
            String data ="hello";
            StringReader sr= new StringReader(data);
            System.out.println("reading");
            int i;
            while((i=sr.read()) !=-1)
                System.out.print((char)i);
            sr.close();
        }catch (IOException ie){
            System.out.println(ie);
        }
    }
}
