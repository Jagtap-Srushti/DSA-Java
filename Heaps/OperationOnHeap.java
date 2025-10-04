package Heaps;

import java.util.*;;

public class OperationOnHeap {
    public static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int val){
            arr.add(val);

            int x=arr.size()-1;

            int par=(x-1)/2;

            while(arr.get(x)<arr.get(par)){
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }

        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minindex=i;

            if(left<arr.size()  && arr.get(minindex) >arr.get(left)){
                minindex=left;
            }

            if(right<arr.size() && arr.get(minindex)>arr.get(right)){
                minindex=right;
            }

            if(minindex!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minindex));
                arr.set(minindex,temp);
                heapify(minindex);
            }
        }

        public int remove(){
            int data=arr.get(0);

            //step first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //stemp2- delete last

            arr.remove(arr.size()-1);
            heapify(0);
            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);

        System.out.println("Peek element is:"+h.peek());


        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }

    
}
    
}
