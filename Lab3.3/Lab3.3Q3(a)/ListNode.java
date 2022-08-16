/********************************************************************************************************/
/**
 * Class ListNode - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class ListNode {
    public Object data;   
    public ListNode next;
    public ListNode(Object data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(Object data, ListNode next) {
        this.data = data;
        this.next = next;
    }
}

/********************************************************************************************************/