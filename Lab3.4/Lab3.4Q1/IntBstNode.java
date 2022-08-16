/********************************************************************************************************/
/**
 * Class IntBstNode - Trees
 *
 * @YUEN Yiu Yeung 
 * @2021-03-30
 */
public class IntBstNode implements BTNode{
    private Object data;
    private IntBstNode left;
    private IntBstNode right;
    public IntBstNode(Object item) {
        data = item;
        left = right = null;
    }
    
    public Object getData() { return data; }
    public String getDataStr(){ return data+"";}
    public IntBstNode getLeft() { return left; }
    public IntBstNode getRight() { return right; }

    public void setLeft(IntBstNode subtree) { left = subtree;}
    public void setRight(IntBstNode subtree) { right = subtree;}
}

/********************************************************************************************************/