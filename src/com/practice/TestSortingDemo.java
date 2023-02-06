package com.practice;
import java.util.ArrayList;
import java.util.Collections;

class Sortedset implements Comparable<Sortedset> {// it must implement comparable interface for storing the unique elements
    int rollno;
    String name;
    int age;
    Sortedset(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
    public int compareTo(Sortedset st){
        if(age==st.age)
            return 0;
        else if (age>st.age)
            return 1;
        else
            return -1;
    }

}
public class TestSortingDemo{
    public static void main(String[] args) {
        ArrayList<Sortedset> al=new ArrayList<Sortedset>();
        al.add(new Sortedset(111,"kavin",23));
        al.add(new Sortedset(112,"bebo",24));
        al.add(new Sortedset(113,"achu",22));

        Collections.sort((al));
        for(Sortedset st:al){
            System.out.println((st.rollno+" "+st.name+" "+st.age));

        }


    }
}
