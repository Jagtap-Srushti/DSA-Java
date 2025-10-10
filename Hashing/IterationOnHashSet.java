package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities=new HashSet<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Pune");
        cities.add("Bangaluru");
        cities.add("Noida");

        System.out.println("Using Iterator");
        //Using Iterator
        Iterator it=cities.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Using Enhanced for loop");
        //Using Enhanced for loop
        for (String city : cities) {
            System.out.println(city);
            
        }

    }
    
}
