public class SubTree {
    // Here we are Gonna Find out The SubTree 
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
public static boolean isIdentical(Node root,Node Subroot){
    if(root==null&&Subroot==null){
        return true;
    }
    else if(root==null||Subroot==null||root.Data!=Subroot.Data){
        return false;
    }

    if(!isIdentical(root.Left, Subroot)){
        return false;
    }
    if(isIdentical(root.Right, Subroot)){
        return false;
    }
return true;
}
public static boolean SubTree(Node root, Node Subroot ){
    if(root==null&&Subroot==null){
        return true;
    }
    if(root.Data==Subroot.Data){
        if(isIdentical(root,Subroot)){
            return true;
        }
    }
    boolean LeftB=SubTree(root.Left, Subroot);
    boolean RightB=SubTree(root.Right, Subroot);
    return LeftB||RightB;


}
public static void main(String[] args) {
    Node root=new Node(1);
        root.Left=new Node(2);
        root.Right=new Node(3);
        root.Left.Left=new Node(4);
        root.Left.Right=new Node(5);
       root .Right.Left=new Node(6);
       root.Right.Right=new Node(7);
       
      Node Subroot=new Node(8);
      Subroot.Left=new Node(9);
      Subroot.Right=new Node(10);
      Subroot.Left.Left=new Node(11);
      Subroot.Left.Right=new Node(12);
      Subroot.Left.Right.Left=new Node(13);
      Subroot.Left.Right.Right=new Node(14);
}
    
}
