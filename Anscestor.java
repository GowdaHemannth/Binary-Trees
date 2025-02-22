import java.util.ArrayList;
public class Anscestor {
    //Here we are Gonna Find out the Least Common Factor Here 
    static class Node{
        int Data;
        Node Left;
        Node Right;
        public Node(int Data){
            this.Data=Data;
            this.Left=Left;
            this.Right=Right;
        }

    }
    public static boolean GetPath(Node root,ArrayList<Node>Path1,int n){
        if(root==null){ // 1st
            return false;
        }
        Path1.add(root);

        if(root.Data==n){
            return true;
        }
        boolean left=GetPath(root.Left, Path1, n);
        boolean right=GetPath(root.Right, Path1, n);

        if(left||right){
            return true;
        }

        Path1.remove(Path1.size()-1);
        return false;



    }
    public static int  LCA(Node root){
        ArrayList<Node>Path1=new ArrayList<>();
        ArrayList<Node>Path2=new ArrayList<>();
        int n=5;
        int n1=3;
       
        GetPath(root,Path1,n);
        GetPath(root,Path2,n1);

        int i = 0;
        while (i < Path1.size() && i < Path2.size()) {
            if (Path1.get(i) != Path2.get(i)) {
                break; // Stop at the first different node
            }
            i++;
        }
        return (Path1.size() - i) + (Path2.size() - i);


    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.Left=new Node(2);
        root.Right=new Node(3);
        root.Left.Left=new Node(4);
        root.Left.Right=new Node(5);
        root.Right.Left=new Node(6);
        root.Right.Right=new Node(7);
        System.out.println(LCA(root));
     
        
    }
    
}
