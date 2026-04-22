class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class AVLTree {
    //Insert in BST
    public static Node insertData(Node root,int val){
        if(root == null) return new Node(val);
        if(val<root.data) {
            root.left = insertData(root.left,val);
        }else{
            root.right = insertData(root.right,val);
        }
        return root;
    }

    //height in BST
    static int height(Node root){
        if(root == null) return 0;
        return Math.max(height(root.left),height(root.right)) +1;
    }

    static Boolean IsBalanced(Node root){
        if(root == null) return true;

        int lh = height(root.left);
        int rh = height(root.right);

        if(Math.abs(lh - rh) > 1) return false;
        return IsBalanced(root.left) && IsBalanced(root.right);
    }
    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            root = insertData(root, val);
        }

        if(IsBalanced(root)){
            System.out.println("Tree is Balanced");
        } else {
            System.out.println("Tree is NOT Balanced");
        }
    }
}
