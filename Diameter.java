public class Diameter {
    // Here We are Going to Find Diameter of the tree ;

    // Another Approach is Just
    // Step1 Find leftHieght And Right Hieght
    // the comapare maxi= Math.max(maxi,lh+rh+1)
    // Since maxi is GLobal varible we can Acces the Maxi then you can get the Maxi
    // -->>>TC IS O N*N
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

    }

    // Diameter of the Binary Tree
    static class info {
        int Dia;
        int Hieght;

        public info(int Dia, int Hieght) {
            this.Dia = Dia;
            this.Hieght = Hieght;
        }
    }

    // Function to find the out the Diameter
    public static info Dia(Node root) {
        if (root == null) {
            return new info(0, 0);
        }

        info LeftInfo = Dia(root.Left);
        info RightInfo = Dia(root.Right);

        int Full = Math.max(Math.max(LeftInfo.Dia, RightInfo.Dia), LeftInfo.Hieght + RightInfo.Hieght + 1);
        int hieght = Math.max(LeftInfo.Hieght, RightInfo.Hieght) + 1;
        return new info(Full, hieght);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, -5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree T = new BinaryTree();
        Node root = T.PreorderTree(nodes);
    }
}
