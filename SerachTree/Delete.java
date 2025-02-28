package SerachTree;


public class Delete {
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
        // Here you need to Delete a Binary Search Tree Node 
        public static Node Delete(Node root,int key){
            if(root.data>key){
                root.left=Delete(root.left, key);
            }
           else if(root.data<key){
                root.right=Delete(root.right,key);
            }
            else{// Here you got your Thing i mean Found the Data;
                // Case 1 The Node your Delteing Do not have the Child Nodes 
                if(root.left==null&&root.right==null){
                    return null;
                }
                // Case 2 The Node you are deleteing only Have One Child Either its of Left Child or it of Right Child 

                if(root.left==null){
                    return root.right;
                }else if(root.right==null){
                    return root.left;
                
                }
                // Third Case Finding Inorder successor and replacing it with
                Node IS= FindSuccess(root.right);
                root.data=IS.data;
                root.right=Delete(root, IS.data);

            }
            return root;
        }
        public static void inorder(Node root) {
            if (root != null) {
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }
    
        public static Node FindSuccess(Node root){
            while(root.left!=null){
                root =root.left;
            }
            return root;
        }

    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);  // Update root after insertion
        }
        Delete(root, 1);
        inorder(root);


    }

    
}
}
