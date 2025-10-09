package Hashing;

import java.util.*;
public class TreeMapCode {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("India",150);
        tm.put("Itlay",2);
        tm.put("Nepal",5);
        tm.put("China",100);
        tm.put("Bhutan",1);

        //Stores element insorted oreder(based on keys) 

        System.out.println(tm); //{Bhutan=1, China=100, India=150, Itlay=2, Nepal=5}
        
        
    }
    
}
