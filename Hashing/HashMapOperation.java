package Hashing;

import java.util.HashMap;
public class HashMapOperation {
    public static void main(String[] args) {
        // Creating HashMap 
        HashMap<String,Integer> hm=new HashMap<>();

        //insert  O(1)
        hm.put("India",150);
        hm.put("China",100);
        hm.put("US", 50);

        System.out.println(hm);

        //get    O(1)
        System.out.println(hm.get("India"));   //ans-150
        System.out.println(hm.get("Indonesia"));  // ans-null


        //containsKey  O(1)

        System.out.println(hm.containsKey("China")); //True
        System.out.println(hm.containsKey("Japan")); //False


        // Remove   O(1)

        System.out.println(hm.remove("China"));
        System.out.println(hm);   //{US=50, India=150}

        //Size

        System.out.println("Size of HashMap is:"+hm.size());   //2

        //isEmpty
        hm.clear();   //clear all the entries in hashMap
        System.out.println("Is HashMap empty: "+hm.isEmpty());  //True


    }
    
}
