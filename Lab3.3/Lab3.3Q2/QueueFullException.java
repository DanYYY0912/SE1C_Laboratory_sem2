/********************************************************************************************************/
/**
 * Class QueueFullException - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class QueueFullException extends RuntimeException {
    public QueueFullException() {
        super("Queue is full.");
    }
}

/********************************************************************************************************/
