package SerachTree;

import java.util.ArrayList;

// Here we are going to Merge two Binnary Trees
public class Merge {
    public static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
         this.data=data;
        }
    } 
    public static void GetInorder(Node root,ArrayList<Integer>A1){
        if(root==null){
            return;
        }
        GetInorder(root.left,A1);
        A1.add(root.data);
        GetInorder(root.right, A1);
    }
    // Function to Merge 
    public static Node BalancedTree(ArrayList<Integer>A,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(A.get(mid));
        root.left=BalancedTree(A, st, mid-1);
        root.right=BalancedTree(A, mid+1, end);

       return root;
    }

    public static Node Merge1(Node root1,Node root2){
        ArrayList<Integer>A1=new ArrayList<>();
        GetInorder(root1, A1);
        ArrayList<Integer>A2=new ArrayList<>();
        GetInorder(root2, A2);

        // Mergeing Two Arraylist 
        int i=0;int j=0;
        ArrayList<Integer>A=new ArrayList<>();
        while(i<A1.size()&&j<A2.size()){
            if(A1.get(i)<=A2.get(j)){
                A.add(A1.get(i));
                i++;

            }else{
                A.add(A2.get(j));
                j++;
            }
        }
        while(i<A1.size()){
            A.add(A1.get(i));
            i++;
        }
        while(j<A2.size()){
            A.add(A2.get(j));
            j++;
        }

           return BalancedTree(A, 0, A.size()-1);


    }


     public static void preorder(Node root){
        if(root==null){
            return;
        }
    
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
     }
    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
       Node h= Merge1(root1, root2);
       preorder(h);
        
    }
    
}
