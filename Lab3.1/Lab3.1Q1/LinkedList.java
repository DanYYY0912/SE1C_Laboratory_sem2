/********************************************************************************************************/
/**
 * Class LinkedList - Linked Lists
 *
 * @YUEN Yiu Yeung 
 * @2021-03-07
 */
public class LinkedList {
    private ListNode head;
    private ListNode tail;
    public LinkedList() {
        head = null;
        tail = null;
    }
    
    public boolean isEmpty() {
        return (head == null);
    }
    
    public void addToHead(Object item) {
       ListNode newNode = new ListNode(item);
       if (isEmpty()) {
           head = tail = new ListNode(item);
       } else {
           head = new ListNode(item, head);
       }
    }
    
    public void addToTail(Object item) {
       ListNode newNode = new ListNode(item);
       if (isEmpty()) {
           head = tail = new ListNode(item);
       } else {
           tail.next = new ListNode(item);
           tail = tail.next;
       }
    }
    
    public Object removeFromHead() throws EmptyListException {
       if (isEmpty())
           throw new EmptyListException();
       Object item = head.data;
       if (head == tail) {
           item = head.data;
           head = tail = null;
       } else {
           head = head.next;
       }
       return item;
    }
    
    public Object removeFromTail() throws EmptyListException {
       if (isEmpty())
           throw new EmptyListException();
       Object item = tail.data;
       if (head == tail) {
           head = tail = null;
           return item;
       } 
       ListNode current = head;
       while (current.next != null)
           current = current.next;
       tail = current;
       tail.next = null;
       return item;
    }

    public String toString() {
       String str = "[ ";
       ListNode curr = head;
       while (curr != null) {
           str += curr.data + " ";
           curr = curr.next;
       }
       return str + "]";
    }
    
    public int getCount() {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    public Object getItemAt(int n) {
        if (n < 0 || n >= getCount())
            throw new IndexOutOfBoundsException();		
        int currentPos = 0;
        ListNode current = head;
        while (currentPos < n) {
            current = current.next;
            currentPos++;
        }
        return current.data;
    }
    
    public Object removeItemAt(int n) {
        if (n < 0 || n >= getCount()) 
            throw new IndexOutOfBoundsException();
        if (n == 0)
            return removeFromHead();
			
        int currentPos = 0;
        ListNode current = head;
        while (currentPos < (n-1)) {
            current = current.next;
            currentPos++;
        }
        Object item = current.next.data;
        current.next = current.next.next;
        return item;
    }
    
    public void addItemAt(Object item, int n) {
        if (isEmpty() || n == 0) {
            addToHead(item);
            return;
        }
        if (n >= getCount()) {
            addToTail(item);
            return;
        }
        int currentPos=0;
        ListNode current = head;
        while (currentPos < (n-1)) { 
            current = current.next;
            currentPos++;
        }
        ListNode newNode = new ListNode(item);
        newNode.next = current.next;
        current.next = newNode;
    }
}

/********************************************************************************************************/
