/********************************************************************************************************/
/**
 * Class QueueEmptyException - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class QueueEmptyException extends RuntimeException {
    public QueueEmptyException() {
        super("Queue is full.");
    }
}

/********************************************************************************************************/
