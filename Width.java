
// Here the Common Mistake we Does is Width Means we only think of Last Level 
// But thats the Mistake Actual Width Means That Can be At Any level Even in the First or Last Level
import java.util.LinkedList;
import java.util.Queue;

public class Width {
    static class Node {
        int data;
        Node Left;
        Node Right;

        public Node(int data) {
            this.data = data;
            this.Left = null;
            this.Right = null;
        }

        static class Pair {
            Node node;
            int HD;

            public Pair(Node node, int HD) {
                this.node = node;
                this.HD = HD;
            }
        }

        public static int Function(Node root) {
            Queue<Pair> Q = new LinkedList<>();
            Q.add(new Pair(root, 0));
            int Ans = 0;
            int First = 0;
            int Last = 0;
            while (!Q.isEmpty()) {
                int size = Q.size();
                int MinHD = Q.peek().HD;
                for (int i = 0; i < size; i++) {
                    //Here For Me these is the Very Important Line in the Whole Code
                    int CurrID = Q.peek().HD - MinHD; // Here Since We Need to Avoid the Test Cases we use these 
                    Node n=Q.peek().node;
                    Q.remove();
                    if (i == 0) {
                        First = CurrID;

                    }
                    if (i == size - 1) {
                        Last = CurrID;
                    }
                    if(n.Left!=null){
                        Q.add(new Pair(n.Left, CurrID*2+1));
                    }
                    if(n.Right!=null){
                        Q.add(new Pair(n.Right, CurrID*2+2));
                    }
                    Ans=Math.max(Ans,Last-First+1);
                }
            }
            return Ans;
        }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.Left = new Node(2);
            root.Right = new Node(3);
            root.Left.Left = new Node(4);
            root.Left.Right = new Node(5);
            root.Right.Left = new Node(6);
            root.Right.Right = new Node(7);
            root.Left.Left.Left = new Node(8);
            root.Left.Left.Right = new Node(9);
            root.Left.Right.Left = new Node(10);
            root.Left.Right.Right = new Node(11);
            root.Right.Left.Left = new Node(12);
            root.Right.Left.Right = new Node(13);
            root.Right.Right.Left = new Node(14);
            root.Right.Right.Right = new Node(15);
            ;
        }
    }

}
