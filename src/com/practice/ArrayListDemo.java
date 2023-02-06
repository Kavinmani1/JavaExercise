package com.practice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        try {
            List arlist = new ArrayList<String>();
            arlist.add("happy");
            arlist.add("For");
            arlist.add("Ever");
            List Secondarraylist=new ArrayList();
            System.out.println(Secondarraylist.addAll(arlist));
            Secondarraylist.add("newItem");
            System.out.println("content in seconarray list"+Secondarraylist);
            System.out.println(arlist);
            System.out.println(arlist.size());
            System.out.println((arlist.contains("xyz")) ? "True" : "False");
            arlist.add("xyz");
            System.out.println((arlist.contains("xyz")) ? "True" : "False");
            System.out.println(arlist.get(0));
            //System.out.println(arlist.get(8));
            System.out.println(arlist.isEmpty());
            arlist.clear();
            System.out.println("post clearing the array list: "+arlist.size());
        }catch (IndexOutOfBoundsException io){
            System.out.println(io);
        }
        System.out.println("Executed Successfully");
    }
}
