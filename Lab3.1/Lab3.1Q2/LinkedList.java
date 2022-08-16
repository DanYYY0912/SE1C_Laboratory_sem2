/********************************************************************************************************/
/**
 * Class LinkedList - Linked Lists
 *
 * @YUEN Yiu Yeung 
 * @2021-03-07
 */
public class LinkedList {
    private Comparator comparator;
    private ListNode head;
    private ListNode tail;
    public LinkedList() {
        this.comparator = null;
    }

    public LinkedList(Comparator comparator) {
        this.comparator = comparator;
    }

    public void insertInOrder(Object item){

        if (isEmpty()){
            addToHead(item);
        } else if (comparator.isGreaterThanOrEqualTo(head.data, item)){
            addToHead(item);
        } else if (comparator.isLessThanOrEqualTo(tail.data, item)) {
            addToTail(item);
        } else {
            ListNode current = head;
            while (current.next != null) {
                if (comparator.isGreaterThanOrEqualTo(current.next.data, item)) {
                    ListNode newNode = new ListNode(item);
                    newNode.next = current.next;
                    current.next = newNode;
                    return;
                }
                current = current.next;
            }
        }
    }

    public void removeItem(Object item) throws ItemNotFoundException{
        if (isEmpty()) {
            throw new ItemNotFoundException();
        } else if (comparator.isEqualTo(item, head.data)) {
            removeFromHead();
        } else if (comparator.isEqualTo(tail.data, item)){
            removeFromTail();
        } else {
            ListNode prev = head;
            while (prev.next != null) {
                if (comparator.isEqualTo(prev.next.data,item)){
                    prev.next = prev.next.next;
                    return;
                }
                prev = prev.next;
            }
            throw new ItemNotFoundException();
        }
    }

    public boolean isEmpty(){return head == null;}

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
        if (head == tail)
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
        if (head == tail) {
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

    public String toString(){
        String str = "[";
        ListNode current = head;
        while (current != null){
            str += current.data + " ";
            current = current.next;
        }
        return str + "]";
    }
}

/********************************************************************************************************/
