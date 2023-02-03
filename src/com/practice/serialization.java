package com.practice;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
public class serialization {
    public static void main(String[] args) {
        try {
            Studentserial s1 = new Studentserial(211, "ravi");
            FileOutputStream s2 = new FileOutputStream("src/com/practice/new4.txt");
            ObjectOutputStream s3 = new ObjectOutputStream(s2);
            s3.writeObject(s1);
            s3.flush();
            s3.close();
            System.out.println("Success");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
