/********************************************************************************************************/
/**
 * Class List - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public interface List {
   public void addToHead(Object item);   // +abstract or not
   public void addToTail(Object item);
   public Object removeFromHead() throws EmptyListException;
   public Object removeFromTail() throws EmptyListException;
   
   // utility function
   public boolean isEmpty();
   public String toString();    // traversal the list from head to tail\
   // --> [23 56 hab]
   // public int length();
}

/********************************************************************************************************/