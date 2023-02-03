package com.workout;
import javax.imageio.IIOException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serial {
    public static void main(String[] args) {
        Student st=new Student(122,"kavinM");

        try {
            FileOutputStream fp = new FileOutputStream("src/com/workout/Serialfile.java");
            ObjectOutputStream ob = new ObjectOutputStream(fp);
            ob.writeObject(st);
            ob.flush();
            ob.close();
            System.out.println("Seriyalized dat is saved in a given location");
        }catch (IOException io){
            System.out.println(io);
        }


    }
}
