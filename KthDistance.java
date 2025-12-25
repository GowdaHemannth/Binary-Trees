public class KthDistance{
    static class Node{
        int Data;
        Node Left;
        Node Right;
        public Node(int Data){
            this.Data=Data;
            this.Left=null;
            this.Right=null;
        }
       
        
    }
    public static void main(String[] args) {
        Node root=new Node(3);
        root.Left = new Node(5);
        root.Right = new Node(1);
        root.Left.Left = new Node(6);
        root.Left.Right = new Node(2);
        root.Left.Right.Left = new Node(7);
        root.Left.Right.Right = new Node(4);
        root.Right.Left = new Node(0);
        root.Right.Right = new Node(8);
    }
}