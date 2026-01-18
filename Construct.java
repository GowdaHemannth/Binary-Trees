// HERE WE WILL BE CONSTRUCTING THE BINARY TREE FROM THE PRE-ORDER SET AND POST ORDER SET 

// IT IS SOMEWHAT OF CONSFUSING NUMERICAL ALL YOU NEED TO DO IS JUST Go Step-by-Step 

// Once you get roort value in pre-order Becuase pre Order Satrts from root hence first value is root 
// Then Find the Root Value in Inorder then we can say all the values in the left are left tree and right are right tree
// So Hence start using the Recursion for Left aand Right 

 // IF INORDER IS GIVEN TO COSTRUCT A TREE THEN WE CAN SAY THAT WE CAN CREATE UNIQE TREE

 // SECOND NUMERICAL CONSTRCUT A BINARY TREE BY USING post-order and inorder
 // POST-ORDER IS ALSO BEST THING POST ORDER STARS WITH LEFT RIGHT SO AMOUNT OF INORDEE LEFT SHOUKD BE EQAUL TO POST ORDER RIGHT RIGHT 
 //
 

import java.util.HashMap;

public class Construct {
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
    public Node Buildtree(int inorder[],int preorder[]){
        HashMap<Integer,Integer>Map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            Map.put(inorder[i],i);
        }
        Node root= Build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, Map);
        return root;
    }

    public Node Build(int preorder[],int PreStart,int PreEnd,int inorder[],int InStart,int InEnd, HashMap<Integer,Integer>Map){
        if(PreStart>PreEnd||InStart>InEnd){
            return null;
        }
        Node root=new Node(preorder[PreStart]);
        int rootValue=Map.get(root.Data);
        int Numsleft=rootValue-InStart;
        // Left tee Reursion
        root.Left=Build(preorder, PreStart+1, PreStart+Numsleft, inorder, InStart, rootValue-1, Map);
        // Right -tree Reursion
        root.Right=Build(preorder, PreStart+Numsleft+1, PreEnd, inorder, rootValue+1, InEnd, Map);

        return root;

    }
        


   

    public static void main(String[] args) {
         int[] inorder = {9, 3, 15, 20, 7};
        int[] preorder = {3, 9, 20, 15, 7};
        
    }
}
