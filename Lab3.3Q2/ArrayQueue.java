/********************************************************************************************************/
/**
 * Class ArrayQueue - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class ArrayQueue implements Queue{
    private static final int CAPACITY = 10;
    private Object [] array;
    private int front;
    private int rear;          // point to the empty slot
    private int capacity;
    
    public ArrayQueue() {
        this(CAPACITY);    
    }
    
    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
        front = rear = 0;
    }
    
    public void enqueue(Object item) throws QueueFullException {
        if (size() + 1 == capacity)
            throw new QueueFullException();
        array[rear] = item;
        rear = (rear + 1) % capacity;
    }
    
    public Object dequeue() throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException();
        Object item = array[front];
        // array [front] = null;
        front = (front + 1) % capacity;
        return item;
    }
    
    public Object front() throws QueueEmptyException {
        if (isEmpty())
            throw new QueueEmptyException();
        return array[front];
    }
    
    public boolean isEmpty() { 
        return (front == rear);
    }
    
    public int size() { 
        int size;
        if (rear > front)
            size = rear - front;
        else
            size = capacity - front + rear;
        return size;
    }
    
    public String toString() {
        String str = "[";
        int next = front;
        for (int i = 0; i < size(); i++)
            str = str + array[i] + " ";
            next = (next + 1) % capacity;
        return str + "]";
    }
}

/********************************************************************************************************/
