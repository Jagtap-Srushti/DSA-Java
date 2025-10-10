package Hashing;

import java.util.LinkedHashSet;
public class LinkedHashSetCode {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();

        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Pune");
        lhs.add("Bangaluru");
        lhs.add("Noida");
        System.out.println("Size of LinkedHashSet is :"+lhs.size());
        //Maintains the order of insertion

        System.out.println(lhs);   //[Mumbai, Delhi, Pune, Bangaluru, Noida]

        lhs.remove("Delhi");
        System.out.println(lhs);

        lhs.clear(); //clears all the element inside the LinkedHashSet

        System.out.println("Is LinkedHashSet empty:"+lhs.isEmpty());


        
    }
    
}
