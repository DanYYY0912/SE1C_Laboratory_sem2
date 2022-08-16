/********************************************************************************************************/
/**
 * Class StringBst - Trees
 *
 * @YUEN Yiu Yeung 
 * @2021-03-30
 */
public class StringBst {
    private StringComparator comparator = new StringComparator();
    protected StringBstNode root;
    public StringBstNode getRoot() { return root;}
    
    public StringBst() { this.root = null; }
    
    public String search(Object item) {
        StringBstNode newNode = new StringBstNode(item);
        if (root == null)
            return null;
        else {
            StringBstNode parent = root;
            StringBstNode curr = root;
            while (curr != null) {
                if (comparator.isEqualTo(item, curr.getData()))
                    return "Found it!";
                parent = curr;    
                if (comparator.isLessThan(item, curr.getData())){
                    curr = curr.getLeft();
                }else {
                    curr = curr.getRight();
                }
            }
        }
        return null;
    }
    
    public void addNode(String item) {
        StringBstNode newNode = new StringBstNode(item);
        if (root == null)
            root = newNode;
        else {
            StringBstNode parent = root;
            StringBstNode curr = root;
            while (curr != null) {
                parent = curr;
                if (comparator.isLessThan(item, curr.getData()))
                    curr = curr.getLeft();
                else
                    curr = curr.getRight();
            }
            if (comparator.isLessThan(item, parent.getData()))
                parent.setLeft(newNode);
            else
                parent.setRight(newNode);
        }    
    }
    
    public String inorder() {
        return "[ " + inorder(root) + "]";
    }
    
    public String inorder(StringBstNode node) {
        String str = "";
        if (node != null) {
            str += preorder(node.getLeft());
            str += node.getData() + " ";
            str += preorder(node.getRight());
        }
        return str;
    }

    public String preorder() {
        return "[ " + preorder(root) + "]";
    }
    
    public String preorder(StringBstNode node) {
        String str = "";
        if (node != null) {
            str += node.getData() + " ";
            str += preorder(node.getLeft());
            str += preorder(node.getRight());
        }
        return str;
    }
    
    public String postorder() {
        return "[ " + postorder(root) + "]";
    }
    
    public String postorder(StringBstNode node) {
        String str = "";
        if (node != null) {
            str += preorder(node.getLeft());
            str += preorder(node.getRight());
            str += node.getData() + " ";
        }
        return str;
    }
}

/********************************************************************************************************/