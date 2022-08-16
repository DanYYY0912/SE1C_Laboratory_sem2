/********************************************************************************************************/
/**
 * Class StackFullException - Stacks
 *
 * @YUEN Yiu Yeung 
 * @2021-03-12
 */
package adtStack;
public class StackFullException extends RuntimeException{
    public StackFullException(){
        super("Stack is not on the list");
    }
}

/********************************************************************************************************/
