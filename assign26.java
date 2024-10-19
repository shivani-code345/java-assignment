class Queue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full, cannot insert " + value);
        } else {
            if (rear == maxSize - 1) {
                rear = -1; 
            }
            queueArray[++rear] = value;
            nItems++;
            System.out.println("Inserted " + value + " into the queue.");
        }
    }
    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty, cannot remove.");
            return -1;
        } else {
            int value = queueArray[front++];
            if (front == maxSize) {
                front = 0; // Wrap around
            }
            nItems--;
            System.out.println("Removed " + value + " from the queue.");
            return value;
        }
    }
    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty, nothing to peek.");
            return -1;
        } else {
            return queueArray[front];
        }
    }
    public boolean isEmpty() {
        return (nItems == 0);
    }
    public boolean isFull() {
        return (nItems == maxSize);
    }
    public int size() {
        return nItems;
    }
}

public class assign26 {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.insert(60);

        System.out.println("Front element is: " + queue.peekFront());

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove(); 

        System.out.println("Queue empty? " + queue.isEmpty());
    }
}
