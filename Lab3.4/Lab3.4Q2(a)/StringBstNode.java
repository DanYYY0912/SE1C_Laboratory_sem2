/********************************************************************************************************/
/**
 * Class StringBstNode - Trees
 *
 * @YUEN Yiu Yeung 
 * @2021-03-30
 */
public class StringBstNode implements BTNode{
    private Object data;
    private StringBstNode left;
    private StringBstNode right;
    public StringBstNode(Object item) {
        data = item;
        left = right = null;
    }
    
    public Object getData() { return data; }
    public String getDataStr(){ return data+"";}
    public StringBstNode getLeft() { return left; }
    public StringBstNode getRight() { return right; }

    public void setLeft(StringBstNode subtree) { left = subtree;}
    public void setRight(StringBstNode subtree) { right = subtree;}
}		

/********************************************************************************************************/