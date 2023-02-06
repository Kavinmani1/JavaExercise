package com.practice;


import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedlistDemo {
    public static void main(String[] args) {
        LinkedList lt=new LinkedList<String>();
        lt.add("Go");
        lt.add("With");
        lt.add("the");
        lt.add("flow");
        System.out.println("content in linkedlist:"+lt);
        ListIterator lit= lt.listIterator(2);
        while(lit.hasNext()){
            System.out.println(lit.next());
        }
        int i;
        for (i=2;i< lt.size();i++){
            System.out.println(lt.get(i));
        }
        System.out.println(lit.previous());

    }
}
