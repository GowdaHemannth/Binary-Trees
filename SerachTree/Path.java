package SerachTree;
import java.util.ArrayList;
public class Path {
    public class BinarySearch {
        public static class Node {  // Make Node static or move it outside
            int data;
            Node left, right;
            
            public Node(int data) {
                this.data = data;
            }
        }
        public static Node insert(Node root, int val) {
            if (root == null) {
                root= new Node(val);
                return root;
            }
            if (root.data > val) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
            return root;
        }
        // Printing the Path from the ArrayList 
          public static void Print(ArrayList<Integer>path){
           for (int i=0;i<path.size();i++){
            System.out.print(path.get(i));
           }
           System.out.println();
          }
        public static void PrinttoLeaf(Node root,ArrayList<Integer>path){
            if(root==null){
                return ;
            }
            path.add(root.data);
            if(root.left==null&&root.right==null){
                Print(path);
            }
            PrinttoLeaf(root.left, path);
            PrinttoLeaf(root.right, path);
            path.remove(path.size()-1);
        }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);  // Update root after insertion
        }
   
        PrinttoLeaf(root, new ArrayList<>());
     
    }
    
}
}