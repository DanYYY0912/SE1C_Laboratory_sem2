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
    private Object [ ] array;
    private int top=-1;
    
    public ArrayStack() {
        this(CAPACITY);
    }
    
    public ArrayStack(int cap) {
        capacity = cap;
        array = new Object[capacity];
    }
    
    public int size() {
        return top+1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }
    
    public void push(Object item) throws StackFullException {
        if (size() == capacity) 
            throw new StackFullException();
            array [++top] = item;
    }
    
    public Object pop() throws StackEmptyException {
        if (isEmpty()) 
            throw new StackEmptyException();
        Object item = array [top];
        array [top--] = null;
        return item;
    }

    public Object top() throws StackEmptyException {
        if (isEmpty()) 
            throw new StackEmptyException();
            return array [top];
        }
}

/********************************************************************************************************/
