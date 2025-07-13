package Stack;
import java.util.*;


public class PushAtBottom {

    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s1=new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        System.out.println("Intaial Stack"+s1);

        pushAtBottom(s1,4);
        System.out.println("Stack After pushing element at bottom"+s1);
    }

    
}
