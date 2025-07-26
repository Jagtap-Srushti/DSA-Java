package Queue;

public class QueueArr {
    int front,rear;
    int[] queue;
    int capacity;

    QueueArr(int capacity){
        this.capacity=capacity;
        front=0;
        rear=-1;
        queue=new int[capacity];
    }

    public boolean isEmpty(){
        return rear==-1;
    }

    public boolean isFull(){
        return rear==capacity-1;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear]=data;

    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=queue[front];
        front++;
        return data;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }

        for(int i=front;i<=rear;i++){
            System.out.println(queue[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueArr q=new QueueArr(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
        System.out.println("Peek element is:"+q.peek());

    }
    
}
