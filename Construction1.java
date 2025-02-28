import java.util.HashMap;

public class Construction1 {
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
    public static int Function(int Inoder[],int Preorder){
        HashMap<Integer,Integer>map=new HashMap<>();
        // Copy inorder Elemnts to the HashMap
        for(int i=0;i<Inoder.length;i++){
            map.put(Inoder[i], i);
        }
        Node root=new Node(Preorder)
    }
    public static Tree

    public static void main(String[] args) {
        int Inorder[]={9,3,15,20,7};
        int Preorder[]={3,9,20,15,7};
        
    }
    
}
