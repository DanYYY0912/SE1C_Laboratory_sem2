/********************************************************************************************************/
/**
 * Class LinkedQueue - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class LinkedQueue implements Queue {
    private LinkedListH qll;
    
    public LinkedQueue() {
        qll = new LinkedListH();
    }
    
    public int size() {
        return qll.getCount();
    }
    
    public boolean isEmpty() {
        return qll.isEmpty();
    }
    
    public void enqueue(Object item) throws QueueFullException {
        qll.addToTail(item);
    }
    
    public Object dequeue() throws QueueEmptyException {
        try {
            Object item = qll.removeFromHead();
            return item;
        }
        catch (EmptyListException e) {
            throw new QueueEmptyException();
        }
    }

    public Object front() throws QueueEmptyException {
        try {
            Object item = qll.removeFromHead();
            qll.addToHead(item);
            return item;
        }
        catch (EmptyListException e) {
            throw new QueueEmptyException();
        }
    }
    
    public String toString() { return qll.toString();}
}

/********************************************************************************************************/

