import java.util.Queue;
import java.util.HashMap;
import java.util.LinkedList;
public class TopView {
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
    static class info{
        Node node;
        int HD;
        public info(Node node,int HD){
            this.node=node;
            this.HD=HD;
        }
    }
    // Here i am Writting Function for the Printting of the TopView;
    public static void TopView(Node root){
        Queue<info>Q=new LinkedList<>();
        HashMap<Integer,Node>map=new HashMap<>();
        int min=0; int max=0;

        Q.add(new info(root,0));
        Q.add(null);

        while(!Q.isEmpty()){
            info Curr=Q.remove();
            if(Curr==null){
          
                if(Q.isEmpty()){
                    break;
                }// Here When i removee ThE null Element From the Queue if the Q is not Empty then Proceed
                else{
                    Q.add(null);
                }
            }else{
                if(!map.containsKey(Curr.HD)){ // This is the first time it occuring
                    map.put(Curr.HD, Curr.node);
                }
                if(Curr.node.Left!=null){
                    Q.add(new info(Curr.node.Left,Curr.HD-1));
                    min=Math.min(min, Curr.HD-1);
                }
                if(Curr.node.Right!=null){
                    Q.add(new info(Curr.node.Right,Curr.HD+1));
                    max=Math.max(max, Curr.HD+1);
                }
            }
        }
        for(int i=min;i<=max;i++){
            System.out.println(map.get(i).Data);
        }

            
        
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.Left=new Node(2);
        root.Right=new Node(3);
        root.Left.Left=new Node(4);
        root.Left.Right=new Node(5);
        root.Right.Left=new Node(6);
        root.Right.Right=new Node(7); 
        TopView(root);   
        
    }
    
}
