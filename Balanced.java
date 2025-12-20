class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Balanced {

    public boolean IsBalanced(Node root) {

        return dfsHieght(root) != -1; // Here automatical if condition staisfy returns True Or else return False
    }

    public int dfsHieght(Node root) {
        // Here Since its Optimized Soluion We will Be doing extr

        if (root == null) {
            return 0;
        }
        int leftHeight = dfsHieght(root.left);
        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = dfsHieght(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

    }

}
