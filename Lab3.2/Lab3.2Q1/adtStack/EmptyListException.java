/********************************************************************************************************/
/**
 * Class EmptyListException - Stacks
 *
 * @YUEN Yiu Yeung 
 * @2021-03-12
 */
package adtStack;
public class EmptyListException extends RuntimeException {
    public EmptyListException() {
        super("List is empty.");
    }
}

/********************************************************************************************************/
