import java.util.ArrayList;
import java.util.List;
// Here we are going to Print Left Side of the tree;
public class Left{
    static class Node{
        int Data;
        Node Right;
        Node Left;
        public Node(int Data){
            this.Data=Data;
            this.Left=null;
            this.Right=null;
        }

        
    }
    public static void LeftView(List<Node> A ,Node root,int k){
        if(root==null){
            return ;
        }
     if(A.size()==k){
        A.add(root);
                                                             // IF(A.SIZE==K)
                                                             // A.ADD(ROOT.DATA)
        LeftView(A, root.Left,k+1);
        LeftView(A, root.Right, k);        // FOR RIGHT VIEW RIGHTVIEW(A,ROOT.RIGHT,K+1)
                                            //               RIGHTVIEW(A,ROOT.LEFT,K)

     }
    
    }
    public static List<Node> function(Node root) {
        List<Node> A = new ArrayList<>();
        LeftView(A,root,0);
        return A;
    }
    public static void main(String[] args) {
         Node root=new Node(1);
        root.Left=new Node(2);
        root.Right=new Node(3);
        root.Left.Left=new Node(4);
        root.Left.Right=new Node(5);
        root.Right.Left=new Node(6);
        root.Right.Right=new Node(7);
        
    }
}