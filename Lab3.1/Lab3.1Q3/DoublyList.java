/********************************************************************************************************/
/**
 * Class DoublyList - Linked Lists
 *
 * @YUEN Yiu Yeung 
 * @2021-03-07
 */
public class DoublyList {
    private DoublyNode head;
    private DoublyNode tail;
	
    public DoublyList() {
        head = tail = null;
    }
    
    public boolean isEmpty() {
        return (head==null);
    }
    
    public void addToHead(Object item) {
        if (isEmpty()) {
            head = tail = new DoublyNode(item);
        } else {
            head.previous = new DoublyNode(item, null, head);
            head = head.previous;
        }
    }

    public void addToTail(Object item) {
        if (isEmpty()) {
            head = tail = new DoublyNode(item);
        } else {
            tail.next = new DoublyNode(item, tail, null);
            tail = tail.next;
        }
    }

    public Object removeFromHead(){
        Object item = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.previous = null;
        }
        return item;
    }

    public Object removeFromTail(){
        Object item = tail.data;
        if (head == tail) { 
            item = head.data;
            head = tail = null;
        } else {
            tail = tail.previous;
            tail.next = null;
        }
        return item;
    }
    
    public String forward(){
        DoublyNode current = head;
        String str = "";
        while(current != null){
            str += current.data + " ";
            current = current.next;
        }
        return str;
    }

    
    public String backward(){
        DoublyNode current = tail;
        String str = "";
        while(current != null){
            str += current.data + " ";
            current = current.previous;
        }
        return str;
    }

}

/********************************************************************************************************/
