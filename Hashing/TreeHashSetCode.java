package Hashing;

import java.util.TreeSet;
public class TreeHashSetCode {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();

        ts.add("Mumbai");
        ts.add("Delhi");
        ts.add("Pune");
        ts.add("Bangaluru");
        ts.add("Noida");
        System.out.println("Size of TreeSet is :"+ts.size()); //Size of TreeSet is :5
        //Stores the element in sorted order

        System.out.println(ts);   //[Bangaluru, Delhi, Mumbai, Noida, Pune]

        ts.remove("Delhi");
        System.out.println(ts);  //[Bangaluru, Mumbai, Noida, Pune]

        ts.clear(); //clears all the element inside the TreeSet

        System.out.println("Is TreeSet empty:"+ts.isEmpty());  //Is TreeSet empty:true

    }
    
}
