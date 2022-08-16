/********************************************************************************************************/
/**
 * Class PersonComparator - Linked Lists
 *
 * @YUEN Yiu Yeung 
 * @2021-03-07
 */
public class ListNode { 
    Object data;
    ListNode next;
    public ListNode(){
        this(null);
    }
    public ListNode(Object data){
        this.data = data;
        this.next = null;
    }
    public ListNode(Object data, ListNode next){
        this.data = data;
        this.next = next;
    }
}

/********************************************************************************************************/
