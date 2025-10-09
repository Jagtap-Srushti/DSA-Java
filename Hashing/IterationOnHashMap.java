package Hashing;

import java.util.*;
public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        //Iterate
        Set<String> keys=hm.keySet(); // Stores all the keys from HashMap

        System.out.println(keys);  

        for (String key : keys) {
            System.out.println("Key:"+key+",value:"+hm.get(key));
        }

    }
}
