
import java.util.ArrayList;
import java.util.List;

public class Boundary {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // iseaf Function
    public static boolean isLeaf(Node root) {
        return root.left == null && root.right == null;
    }

    // TO Print Left Boundary
    public static void LeftBoundary(Node root,List<Integer>A){
        Node curr=root.left;
        while(curr!=null){
            if(!isLeaf(curr)){
                A.add(curr.data);
            }
            if(curr.left!=null){
                curr=curr.left;
            }else{
        //                1
      // /               /
     //                 2   -->> These IS the Reason 
            //           \
      //                    3 
                      
      // \
      //  3  These is the Reason

                curr=curr.right;  // -->> Here I will Having Doubt Why Should I Need to go Rigth While We are Tarverel
            }
        }

    }

    public static void RightBoundary(Node root, List<Integer> A) {
        Node curr = root.right;
        List<Integer> Temp = new ArrayList<>();
        while (curr != null) {
            if (!isLeaf(curr)) {
                Temp.add(curr.data);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        for (int i = Temp.size() - 1; i >= 0; i--) {
            A.add(Temp.get(i));
        }

    }

    public static void Leaves(Node root, List<Integer> A) {
        if (isLeaf(root)) {
            A.add(root.data);
        }
        if (root.left != null) {
            Leaves(root.left, A);
        }
        if (root.right != null) {
            Leaves(root.right, A);
        }

    }

    public static List<Integer> Traversel(Node root, List<Integer> A) {

        if (!isLeaf(root)) {
            A.add(root.data);

        }
        LeftBoundary(root, A);
        Leaves(root, A);
        RightBoundary(root, A);

        return A;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);
        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);
        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);
        ;
        List<Integer> A = new ArrayList<>();
        Traversel(root, A);
        for (int i = 0; i < A.size(); i++) {
            System.out.println(A.get(i));
            System.out.println();
        }

    }

}
