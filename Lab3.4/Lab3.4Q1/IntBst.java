/********************************************************************************************************/
/**
 * Class IntBst - Trees
 *
 * @YUEN Yiu Yeung 
 * @2021-03-30
 */
public class IntBst {
    private IntComparator comparator = new IntComparator();
    protected IntBstNode root;
    public IntBstNode getRoot() { return root;}

    public IntBst() {
        root = null;
    }
    
    public void addNode(Object item) {
        IntBstNode newNode = new IntBstNode(item);
        if (root == null)
            root = newNode;
        else {
            IntBstNode parent = root;
            IntBstNode curr = root;
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

    public String preorder() {
        return "[ " + preorder(root) + "]";
    }

    public String preorder(IntBstNode node) {
        String str = "";
        if (node != null) {
            str += node.getData() + " ";
            str += preorder(node.getLeft());
            str += preorder(node.getRight());
        }
        return str;
    }

    public String inorder() {
        return "[ " + inorder(root) + "]";
    }

    public String inorder(IntBstNode node) {
        String str = "";
        if (node != null) {
            str += preorder(node.getLeft());
            str += node.getData() + " ";
            str += preorder(node.getRight());
        }
        return str;
    }

    public String postorder() {
        return "[ " + postorder(root) + "]";
    }

    public String postorder(IntBstNode node) {
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