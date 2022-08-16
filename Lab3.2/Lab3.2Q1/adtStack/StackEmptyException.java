/********************************************************************************************************/
/**
 * Class StackEmptyException - Stacks
 *
 * @YUEN Yiu Yeung 
 * @2021-03-12
 */
package adtStack;
public class StackEmptyException extends RuntimeException{
    public StackEmptyException(){
        super("Stack is not on the list");
    }
}

/********************************************************************************************************/
