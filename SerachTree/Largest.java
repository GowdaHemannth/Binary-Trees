package SerachTree;
// Here we are Going To find the Largest Binary Search Tree in the Binary Tree

public class Largest {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
         this.data=data;
        }
    }
    // Craeting static Class for the Node
    public static class Info{
        boolean isValid;
        int size;
        int min;
        int max;
        public Info(boolean isValid,int size,int min,int max){
            this.isValid=isValid;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }

   public  static int MaxBst=0;

   public static Info BigBst(Node root){
    if(root==null){
        return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }
       Info LeftInfo=BigBst(root.left);
       Info RightInfo=BigBst(root.right);

       int size=LeftInfo.size+RightInfo.size+1;
       int min=Math.min(root.data,Math.min(LeftInfo.min,RightInfo.min));
       int max=Math.max(root.data,Math.max(LeftInfo.max, RightInfo.max));

       if(root.data<=LeftInfo.max||root.data>=RightInfo.min){
        return new Info(false, size, min, max);
       }

       if(LeftInfo.isValid&&RightInfo.isValid){
        MaxBst=Math.max(size, MaxBst);
        return new Info(true, size, min, max);
       }
       return new Info(false, size, min, max);
   }
    public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);

        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);
        BigBst(root);
        System.out.println("The size of largest BST is "+ MaxBst);
        
    }
    
}
