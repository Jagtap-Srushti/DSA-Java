package Queue;

public class CircularQueueArr {
    int front,rear,capacity;
    int size;
    int queue[];
    CircularQueueArr(int capacity){
        this.capacity=capacity;
        front=0;rear=-1;
        size=0;
        queue=new int[capacity];

    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;

    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }

        rear=(rear+1)%capacity;
        queue[rear]=data;
        size++;

    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int data=queue[front];
        if(front==rear){
            front=0;
            rear=-1;
        }
        else{
            front=(front+1)%capacity;
        }
        size--;

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

        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(queue[index] + " ");
        }
        System.out.println();  
    }
    public static void main(String[] args) {
         CircularQueueArr q = new CircularQueueArr(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display(); // Output: 10 20 30 40 50
        q.dequeue();
        q.dequeue();
        q.enqueue(60);
        q.enqueue(70);
        q.display();

        System.out.println("peek Element is:"+q.peek());
    }
    
}
