package Stack;

class Stack{
    int maxSize;
    int stackArr[];
    int top;
    Stack(int size){
        maxSize=size;
        stackArr=new int[maxSize];
        top=-1;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top==maxSize-1){
            return true;
        }
        else{
            return false;
        }
    }
    

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is overflow");
            return;
        }
        stackArr[++top]=data;

    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is underflow");
            return -1;
        }
        return stackArr[top--];

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArr[top];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        int temp=top;
        while(temp!=-1){
            System.out.println(stackArr[temp]);
            temp--;
        }
    }

}

public class StackUsingArray {
    public static void main(String[] args){
        Stack st=new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display();
        st.pop();
        System.out.println("Stack after poping out top element");
        st.display();
        System.out.println("Peek element:"+st.peek());
    }
    
}
