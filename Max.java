// Here we are Going to TO find the Distance Between THe two Nodes 

import java.util.LinkedList;
import java.util.Queue;

public class Max {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=right;
        }
    }
    static class info{
        Node node;
        int HD;
        public info(Node node ,int HD){
            this.node=node;
            this.HD=HD;
        }
    }
    public static int MAXWIDTH(Node root){
        Queue<info>Q=new LinkedList<>();
        Q.add(new info(root,0));
        int ans=0;
        while(!Q.isEmpty()){
       
            int Last=0;
            int First =0;
            int size=Q.size();
             int min=Q.peek().HD;
            for(int i=0;i<size;i++){
                int curr_id=Q.peek().HD-min;
                Node p=Q.remove().node;
                if(i==0){
                    First=curr_id;

                }

               if(i==size-1){
                Last=curr_id;
               }
            if(p.left!=null){
                Q.add(new info(p.left, curr_id*2+1));
            }
            if(p.right!=null){
                Q.add(new info(p.right, curr_id*2+2));
            }
            }
            ans =Math.max(ans,Last-First+1);



        }
        return ans;
        
    }
    public static void main(String[] args) {
        
    }
    
}
