/********************************************************************************************************/
/**
 * Class Queue - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public interface Queue {
    public abstract void enqueue(Object item) throws QueueFullException;
    public abstract Object dequeue() throws QueueEmptyException;
    public abstract Object front() throws QueueEmptyException;
    public abstract boolean isEmpty();
    public abstract int size();
}

/********************************************************************************************************/
