package com.practice;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Deserialition {
    public static void main(String[] args) {
        try{
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("src/com/practice/new4.txt"));
            Studentserial ss=(Studentserial)in.readObject();//type casting is taking place
            //printing the data of the serialized object
            System.out.println(ss.id+" "+ss.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}

