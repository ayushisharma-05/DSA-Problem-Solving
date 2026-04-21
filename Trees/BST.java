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
public class BST {
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

    //Search in BST
    public static boolean search(Node root,int key){
        if(root == null ) return false;
        if(root.data == key) return true;
        if(key <root.data) {
            search(root.left, key);
        }else{
            search(root.right, key);
        }
        return false;
    }
    // 
    public static void Inorder(Node root){
        if(root == null ) return ;
        Inorder(root.left);
        System.out.println(root.data);
        Inorder(root.right);
    }

    // search the smallest element in BST

    public static int Smallest(Node root){
        if (root == null) return -1;
        Node curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr.data;
    }

    public static boolean IsValidBST(Node root){
        if (root == null) return true;
        if (root.left != null && root.left.data >= root.data) {
        return false;
        }
        if (root.right != null && root.right.data <= root.data) {
        return false;
        }
        
        return IsValidBST(root.left) && IsValidBST(root.right);
        
    }
    public static void main(String[] args) {
        Node root = null;
        int[] values = {50, 30, 20, 40, 70, 60, 80};

        for (int val : values) {
            root = insertData(root, val);
        }

        System.out.println("\nSmallest element: " + Smallest(root));

        IsValidBST(root);


    }
}

// boolean check(Node root) {
//    if (root == null) {
//         return true;
//     }
//     if (root.left != null) {
//         if (root.left.data >= root.data) {
//             return false;
//         }
//         if (!check(root.left)) {
//             return false;
//         }
//     }
//     if (root.right != null) {
//         if (root.right.data <= root.data) {
//             return false;
//         }
//         if (!check(root.right)) {
//             return false;
//         }
//     }
//     return true;

// }