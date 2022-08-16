/********************************************************************************************************/
/**
 * Class QueueTest - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class QueueTest {    
    public static void main(String [] args) {
        Queue queue = new LinkedQueue();
        
        queue.enqueue("Alex");
        System.out.println("Front: " + queue.front());
        System.out.println(queue);
        queue.enqueue("Sandy");
        System.out.println("Front: " + queue.front());
        System.out.println(queue);
        queue.enqueue("Betty");
        System.out.println("Front: " + queue.front());
        System.out.println(queue);
        System.out.println("Removed: " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed: " + queue.dequeue());
        System.out.println(queue);
        System.out.println("Removed: " + queue.dequeue());
        System.out.println(queue);
    }
}

/********************************************************************************************************/