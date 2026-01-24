import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class ZigZag {
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
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
            boolean leftToRight = true;// Special One
            List<Integer>A=new ArrayList<>();
            for(int i=0;i<size;i++){
                Node T=Q.remove();
                int index = leftToRight ? i : (size - 1 - i);// if that leftto true left right direction that is i else right to left

                // Insert the node's value at
                // the determined index
                A.add(index,T.data);
                if(T.left!=null){
                    Q.add(T.left);
                }
                if(T.right!=null){
                    Q.add(T.right);
                }
               
            }
            Ans.add(A);
            // Here After the For Loop Ends These Condition Comes Here 
            leftToRight = !leftToRight; // ✅ THIS was missing
        }
        return Ans;
    }
    public static void main(String[] args) {
        
    }
    
}
