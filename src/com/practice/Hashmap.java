package com.workout;
import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        System.out.println("initial list of elements:"+hm);
        hm.put(1,"kavin");
        hm.put(2,"vijay");
        hm.put(3,"Rahul");
        System.out.println("After using the put methord");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(104,"Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

