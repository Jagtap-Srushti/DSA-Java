package Heaps;

import java.util.*;

public class PriorityQueueForObjects {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        // PriorityQueue<Student> pq=new PriorityQueue<>(Comparator.reverseOrder()); //stores the objects in reverse order
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 2));
        pq.add(new Student("C", 12));
        pq.add(new Student("X", 3));
        pq.add(new Student("D", 10));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}
