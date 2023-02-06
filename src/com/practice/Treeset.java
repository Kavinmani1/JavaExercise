package com.practice;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> al=new TreeSet<String>();
        al.add("Ravi");
        al.add("vijay");
        al.add("Ravi");
        al.remove("vijay" );
        al.add("Ajay");
        Iterator<String>itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(al.headSet("Ajay"));


    }
}
