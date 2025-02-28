public class SumChild {
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
    public static void ChildSumProperty(Node root){
        if(root==null){
            return;
        }
        int child=0;

        if(root.left!=null){
            child=child+root.left.data;

        }
        if(root.right!=null){
            child=child+root.right.data;
        }
        if(child>=root.data){
            root.data=child;
        }else{
            if(root.left!=null){
            root.left.data=root.data;

            }
            if(root.right!=null){
                root.right.data=root.data;
            }
        }
        ChildSumProperty(root.left);
        ChildSumProperty(root.right);
        int total=0;
        if(root.left!=null){
            total=total+root.left.data;
        }
        if(root.right!=null){
            total=total+root.right.data;
        }
        if(root.left!=null||root.right!=null){
          root.data=total;
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
        Node root=new Node(40);
        root.left=new Node(10);
        root.right=new Node(20);
        root.left.left=new Node(15);
        root.left.right=new Node(5);
        root.right.left=new Node(30);
        root.right.right=new Node(40);
        ChildSumProperty(root);
        Printnode(root);


        
    }
    
}
