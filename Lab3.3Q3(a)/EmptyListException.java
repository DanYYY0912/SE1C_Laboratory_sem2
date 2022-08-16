/********************************************************************************************************/
/**
 * Class EmptyListException - Queue
 *
 * @YUEN Yiu Yeung 
 * @2021-03-18
 */
public class EmptyListException extends RuntimeException {
    public EmptyListException() {
        super("List is empty.");
    }
}

/********************************************************************************************************/