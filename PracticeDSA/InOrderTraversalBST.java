import org.w3c.dom.Node;

public class InOrderTraversalBST {
    Node root;

    public static void main(String[] args) {
        InOrderTraversalBST tree=new InOrderTraversalBST();
        tree.root=new Node(10);
        tree.root.left=new Node(5);
        tree.root.right=new Node(7);
        tree.root.left.left=new Node(8);
        tree.root.left.right=new Node(9);
        tree.root.right.left=new Node(0);
        tree.root.right.right=new Node(1);

        inOrder(tree.root);

    }
    static class Node{
        Object data;
        Node left;
        Node right;
        Node(Object data){
            this.data=data;
        }
    }
    public void inOrder(Node root){
        if (root!=null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

}
