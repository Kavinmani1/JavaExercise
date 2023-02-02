package com.practice;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;


public class Bufferoutput {
        public static void main(String[] args) {
            try {
                FileOutputStream fos =
                        new FileOutputStream("src/com/practice/new2.txt");

                //Creating BufferedOutputStream object.
                BufferedOutputStream bos =
                        new BufferedOutputStream(fos);

                bos.close();
                System.out.println("sucessfully wrote the file");
            }catch(Exception e){
                System.out.println("Ioexception:"+e.getMessage());
            }
        }
    }
