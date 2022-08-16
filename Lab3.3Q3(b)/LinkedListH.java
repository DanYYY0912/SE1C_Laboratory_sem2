/********************************************************************************************************/
/**
 * Class LinkedListH - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class LinkedListH implements List{
    private ListNode head;

    public LinkedListH() { head = null; }
    
    public boolean isEmpty() {return (head==null);}

    public void addToHead(Object item) { 
        ListNode newNode = new ListNode(item);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addToTail(Object item) {
        ListNode newNode = new ListNode(item);
        if (isEmpty()) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    public Object removeFromHead() throws EmptyListException { 
        if (isEmpty()) {
            throw new EmptyListException();
        } 
        Object item = head.data;
        head = head.next;
        return item;
    }

    public Object removeFromTail() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException();
        } 
        Object item = null;
        if (head.next == null) {
            item = head.data;
            head = null;
        } else {
            ListNode prev = head;
            while (prev.next.next != null)
                prev = prev.next;
            item = prev.next.data;
            prev.next = null;
        }
        return item;
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
    
    public int getCount() {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

/********************************************************************************************************/