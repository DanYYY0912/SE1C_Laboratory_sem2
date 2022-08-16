/********************************************************************************************************/
/**
 * Class LinkedStack - Stacks
 *
 * @YUEN Yiu Yeung 
 * @2021-03-12
 */
package adtStack;
import adtList.LinkedList;
public class LinkedStack implements Stack {
    private LinkedList  sll;
    
    public LinkedStack() {
        sll = new LinkedList();
    }

    public int size() {
        return sll.getCount();
    }
    public boolean isEmpty() { 
        return sll.isEmpty();
    }
    public void push(Object item) throws StackFullException {
        sll.addToHead(item);
    }
    public Object pop() throws StackEmptyException {
        try {
            Object item = sll.removeFromHead();
            return item;
        } 
        catch (EmptyListException e) { 
            throw new StackEmptyException();
        }
    }
    public Object top() throws StackEmptyException {
        try {
            Object item = sll.removeFromHead();
            sll.addToHead(item);
            return item;
        }
        catch (EmptyListException e) {
            throw new StackEmptyException();
        }
    }
}

/********************************************************************************************************/
