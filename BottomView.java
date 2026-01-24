import java.util.Queue;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
public class BottomView {
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
    public static void Function(Node root){
        Queue<info>q=new LinkedList<>();
       Map<Integer, Node> map = new TreeMap<>();
    
        q.add(new info(root, 0));
        q.add(null);
        while(!q.isEmpty()){
            info Curr=q.remove();
            if(Curr==null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                map.put(Curr.HD,Curr.node);
                if(Curr.node.Left!=null){
                    q.add(new info(Curr.node.Left, Curr.HD-1));
                }
                if(Curr.node.Right!=null){
                    q.add(new info(Curr.node.Right, Curr.HD+1));
                }
            }

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
    }
    
}
