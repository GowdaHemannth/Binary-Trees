import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LevelPrint {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }

    }
    public static List<List<Integer>> Function(Node root){
        List<List<Integer>>Ans=new ArrayList<>();
        if(root==null){
            return Ans;
        }

        Queue<Node>Q=new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()){
            int size=Q.size();
            List<Integer>A=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node T=Q.remove();
                A.add(T.data);
                if(T.left!=null){
                    Q.add(T.left);
                }
                if(T.right!=null){
                    Q.add(T.right);
                }
            }
            Ans.add(A);
            
        }
        return Ans;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Function(root);
        
        
    }
    
}
