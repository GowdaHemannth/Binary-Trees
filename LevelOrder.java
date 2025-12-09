import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder {
    // Here We are Building The Preorder Traversel Tree ;
    static class Node {
        int Data;
        Node Left;
        Node Right;

        public Node(int Data) {
            this.Data = Data;
            this.Left = null;
            this.Right = null;
        }
    }

    static class BinaryTree {
        static int Idx = -1;

        public static Node PreorderTree(int nodes[]) {
            Idx++;
            if (nodes[Idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[Idx]);
            newNode.Left = PreorderTree(nodes);
            newNode.Right = PreorderTree(nodes);
            return newNode;
        }

        // LevelOrder Traversel
        public static void Level(Node root) {
            if (root == null) {
                return;

            }
            Queue<Node> Q = new LinkedList<>();
            Q.add(root);
            Q.add(null);
            while (!Q.isEmpty()) {
                Node CurrNode = Q.remove();
                if (CurrNode == null) {
                    System.out.println();
                    if (Q.isEmpty()) {
                        break;
                    } else {
                        Q.add(null); // Here we might be Having the Doubt Has Why do we need to 
                        // Know since Queu is First in First out So Here thes estep usefull 
                    }

                } else {
                    System.out.print(CurrNode.Data);

                    if (CurrNode.Left != null) {
                        Q.add(CurrNode.Left);
                    }
                    if (CurrNode.Right != null) {
                        Q.add(CurrNode.Right);
                    }
                }

            }

        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, -5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree T = new BinaryTree();
        Node root = T.PreorderTree(nodes);
        System.out.println(root.Data);
        T.Level(root);
    }
}
