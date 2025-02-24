import java.util.ArrayList;
import java.util.List;

public class Left{
    static class Node{
        int Data;
        Node Right;
        Node Left;
        public Node(int Data){
            this.Data=Data;
            this.Left=Left;
            this.Right=Right;
        }

        
    }
    public static void LeftView(List<Node> A ,Node root){
        if(root==null){
            return ;
        }
     A.add(root);
     LeftView(A, root.Left);
    }
    public static List<Node> function(Node root) {
        List<Node> A = new ArrayList<>();
        LeftView(A,root);
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