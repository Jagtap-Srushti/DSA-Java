package Hashing;

import java.util.*;
public class LinkedHashMapCode {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();

        lhm.put("India",150);
        lhm.put("itlay",2);
        lhm.put("Nepal",5);
        lhm.put("China",100);
        lhm.put("Bhutan",1);
        //elemnts gets store in same order it is gets inserted
        System.out.println(lhm); //{India=150, itlay=2, Nepal=5, China=100, Bhutan=1}



    }
    
}
