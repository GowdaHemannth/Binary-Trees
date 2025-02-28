import java.util.Stack;
// Here we aregoing to  Make Binary Tree Look like LinkedList But we are not craeting a LinkedList

public class LinkedList {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static void FalttenLinked(Node root){
        if(root==null){
            return ;
        }
        
        Stack<Node>S=new Stack<>();
        S.push(root);
        while(!S.isEmpty()){
            Node curr=S.pop();
            // Right Node 
            if(curr.right!=null){
                S.push(curr.right);
            }
            // Left Node 
            if(curr.left!=null){
                S.push(curr.left);
            }
            // Making Connections
            if(!S.isEmpty()){
                curr.right=S.peek();
            }
            curr.left=null;

        }



    }
    public static void Printnode(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        Printnode(root.left);
        Printnode(root.right);
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
        FalttenLinked(root);
        Printnode(root);
        
    }
    
}
