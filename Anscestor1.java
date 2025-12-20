import java.util.ArrayList;
//Here We are Gonna Find out the KTH Ansector Node Means node will be 5 k =2 means 1 see binary tree you will get it

public class Anscestor1 {
    static class Node {
        int Data;
        Node Left;
        Node Right;

        public Node(int Data) {
            this.Data = Data;
            this.Left = Left;
            this.Right = Right;
        }

    }

    public static boolean GetPath(Node root, ArrayList<Node> Path1, int n) {
        if (root == null) {
            return false;
        }
        Path1.add(root);
        if (root.Data == n) {
            return true;
        }
        boolean LeftPath = GetPath(root.Left, Path1, n);
        boolean RightPath = GetPath(root.Right, Path1, n);

        if (LeftPath || RightPath) {
            return true;
        }

        Path1.remove(Path1.size() - 1);
        return false;

    }

    public static Node LCA(Node root, int k) {
        ArrayList<Node> Path1 = new ArrayList<>();
        GetPath(root, Path1, k);
        int n = 5;
        int i = 0;
        for (; i < Path1.size(); i++) {
            if (Path1.get(i).Data == n) {
                break;

            }

        }

        return Path1.get(i - k);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.Left = new Node(2);
        root.Right = new Node(3);
        root.Left.Left = new Node(4);
        root.Left.Right = new Node(5);
        root.Right.Left = new Node(6);
        root.Right.Right = new Node(7);
        int k = 2;
        System.out.println(LCA(root, k).Data);

    }

}
