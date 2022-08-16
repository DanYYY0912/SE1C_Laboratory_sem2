/********************************************************************************************************/
/**
 * Class LinkedList - Trees
 *
 * @YUEN Yiu Yeung 
 * @2021-03-30
 */
public class LinkedList {
    protected ListNode head;
    protected ListNode tail;
    private StringComparator comparator = new StringComparator();
    public LinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return (head==null);
    }

    public void addToHead(Object item) { 
        if (isEmpty()) {
            head = tail = new ListNode(item);
        } else {
            head = new ListNode(item, head);
        }
    }

    public void addToTail(Object item) { 
        if (isEmpty()) {
            head = tail = new ListNode(item);
        } else {
            tail.next = new ListNode(item);
            tail =  tail.next;
        }
    }
    
    public Object removeFromHead() throws EmptyListException { 
        Object item = null;
        if (isEmpty()) {
            throw new EmptyListException();
        } 
        item = head.data;
        if (head == tail)      // there's only one single node
            head = tail = null;
        else
            head = head.next;
        return item;
    }

    public Object removeFromTail() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException();
        } 
        Object item = tail.data;
        if (head == tail) {   // there is only one node
            head = tail = null;
            return item;
        }
        ListNode current = head;
        while (current.next != tail)
            current = current.next;
        tail = current;
        tail.next = null;
        return item;
    }

    public int getCount() {
        int count = 0;
        ListNode curr = head;
        while (curr != null){
            count++;
            curr = curr.next;
        }
        return count;

    }
    public String toString() { 
        String s = "[ ";
        ListNode current = head;
        while (current != null) {
            s += current.data + " ";
            current = current.next;
        }
        return s + "]";
    }
    public String search(Object item) {
        ListNode current = head;
        while (current != null) {
            if (comparator.isEqualTo(item, current.data))
                return "Found";
            current = current.next;    
        }
        return null;
    }
}

/********************************************************************************************************/