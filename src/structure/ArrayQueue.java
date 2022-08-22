package structure;

public class ArrayQueue {
    private int front;
    private int rear;
    private int queueSize;
    private String[] itemArr;

    public ArrayQueue(int queueSize){
        this.front = -1;
        this.rear = -1;
        this.queueSize = queueSize;
        this.itemArr = new String[queueSize];
    }

    public boolean isEmpty(){
        return this.front == this.rear;
    }

    public boolean isFull(){
        return this.rear == this.queueSize-1;
    }


    public void enqueue(String item){
        if(isEmpty()){
            this.front = -1;
            this.rear = -1;
        }

        if(isFull()){
            System.out.println("Inserting fail! Array Queue is full!!");
        } else {
            itemArr[++rear] = item;
            System.out.println("Inserted Item : " + item);
        }
    }

    public String dequeue(){
        if(isEmpty()){
            System.out.printf("Array Queue is empty!! %n %n");
            return null;
        } else {
            System.out.printf("Array Queue>> ");
            System.out.println(itemArr[++front]);
            return itemArr[front];
        }
    }

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        arrayQueue.enqueue("1");
        arrayQueue.enqueue("2");
        arrayQueue.enqueue("3");
        arrayQueue.enqueue("4");
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();
        arrayQueue.dequeue();


    }

}
