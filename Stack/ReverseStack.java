package Stack;
import java.util.*;



public class ReverseStack {

    public static void pushBackward(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushBackward(s,data);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushBackward(s,top);

    }

    public static void display(Stack<Integer> s){
        for(int ele:s){
            System.out.println(ele);
        }

    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Intial Stack:");
        display(s);
        reverseStack(s);
        System.out.println("Stack after reversing:");
        display(s);
    

    }
    
}
