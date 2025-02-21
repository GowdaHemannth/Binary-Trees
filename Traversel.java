public class Traversel {
    static class Node{
        int Data;
        Node Left;
        Node right;
        public Node(int Data){
            this.Data=Data;
            this.Left=null;
            this.right=null;
        }
    }
    public class Binarytree{
        public static void PreOrder(Node root){ // These what we got from previous Root 
            // Printing PreOrder;
            if(root==null){
                return ;
            }
            System.out.println(root.Data); /// Preorder First Print Root 
            PreOrder(root.Left); // Next Call the Left Node ;
            PreOrder(root.right);// Next call the Right Node ;

        }

    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,5,3,6};
    }
    
}
