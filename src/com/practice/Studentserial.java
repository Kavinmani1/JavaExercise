package com.practice;
import java.io.Serializable;

public class Studentserial implements Serializable{
    int id;
    String name;
    public Studentserial(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}
