/********************************************************************************************************/
/**
 * Class ArrayStack - Stacks
 *
 * @YUEN Yiu Yeung 
 * @2021-03-12
 */
public class ArrayStack implements Stack { 
    public static final int CAPACITY=1000;
    private int capacity;
    private Object [] array;
    private int top;
    
    public ArrayStack() {
        this(CAPACITY);
    }
    
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
        top = -1;
    }
    
    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
    public void push(Object item) throws StackFullException {
        if (size() == capacity - 1) 
            throw new StackFullException();
        array[++top] = item;
    }
    
    public Object pop() throws StackEmptyException {
        if (isEmpty()) 
            throw new StackEmptyException();
        return array [top--];
    }

    public Object top() throws StackEmptyException {
        if (isEmpty()) 
            throw new StackEmptyException();
        return array [top];
        }
}

/********************************************************************************************************/
