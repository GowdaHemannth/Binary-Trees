package SerachTree;

public class Mirror {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
        
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }
        else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    // Creating the mirror of the Binary Tree 

    public static Node Mirror(Node root){
        if(root==null){
            return null;
        }
        Node LeftSub=Mirror(root.left);
        Node RightSub=Mirror(root.right);
        root.left=RightSub;
        root.right=LeftSub;

        return root;
    }
    public static void main(String[] args) {
        int val[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);  
        }
        
    }
    
}
