package SerachTree;
public class BinarySearch {
    public static class Node {  // Make Node static or move it outside
        int data;
        Node left, right;
        
        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root= new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);  // Update root after insertion
        }

        // Print inorder traversal (should be sorted)
        System.out.println("Inorder Traversal:");
        inorder(root);
    }
}
