package Stack;
import java.util.ArrayList;


class StackArrayList{
    ArrayList<Integer> list=new ArrayList<>();

    public boolean isEmpty(){
        return list.size()==0;
    }

    public void push(int data){
        list.add(data);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is uns=derflow");
            return -1;
        }

        int mid=list.get(list.size()-1);
        list.remove(list.size()-1);
        return mid;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return list.get(list.size()-1);
    }

    public void dispaly(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }

}

public class StackUsingArrayList {
    public static void main(String[] args){

        StackArrayList st=new StackArrayList();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Intial Stack:");
        st.dispaly();

        System.out.println("Stack after deleting top element");
        st.pop();
        st.dispaly();

        System.out.println("Peek element :"+st.peek());


    }
    
}
