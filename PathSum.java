public class PathSum {
    // Here we are going to Fing thE maximum PathSum of a Element By considering Left Data and Right Data ;
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int MaxPath(Node root){
        int Max[]=new int[1];
        Path(root, Max);
        return Max[0];
    }
    public static int Path(Node root,int Max[]){
        if(root==null){
            return 0;
        }
        int l=Math.max(0, Path(root.left, Max));
        int r=Math.max(0, Path(root.right, Max));
        Max[0]=Math.max(Max[0], l+r+root.data);
        return Math.max(l, r)+root.data;
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
        root.right.right.right = new Node(15);;
        
    }
    
}
