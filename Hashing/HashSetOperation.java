package Hashing;

import java.util.HashSet;
public class HashSetOperation {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();

        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(1);
        hs.add(2);
        //print Hashset
        System.out.println(hs);  //[1, 2, 5, 7]

        System.out.println("Size of hashset is:"+hs.size());

        if(hs.contains(2)){
            System.out.println("HashSet Contains 2");  //This will get execute
        }

        if(hs.contains(6)){
            System.out.println("Hashset contains 6");  //This will not get execute
        }

        hs.remove(1);
        System.out.println("HashSet after removing element:"+hs);  //[2, 5, 7]

        hs.clear();   //Remove all the elements from HashSet

        if(hs.isEmpty()){   //Checks if HashSet is Empty Or Not
            System.out.println("HashSet is empty");
        }
        else{
            System.out.println("HashSet is not empty");
        }
    }
    
}
