// Here The Numerical so Some What Differnt As Compared to Previous Things 
// Here numerical is to DELETE AN NODE FROM AN TREE 
// HERE THE THINGS GET SOME WHAT DIFFERNT 
// HERE 1ST STEP IS TO FIND THE ELEMENT AND DELETE THE ELEMNT 
// BUT HERE THINGS GET SOME WHAT DIFFERNT 
// HERE IS THE THING IF THEY MENTION BINARY SEARCH TREE 
// THEN WE NEED TO THINK THAT LEFT NODES SHOULD BE <ROOT NODE<RIGHT NODE
public class NewNumerical {
    public static class Node{
        int Data;
        Node Left;
        Node Right;

        public Node(int Data){
            this.Data=Data;
            this.Left=null;
            this.Right=null;
        }
    }
   
    public static Node DeleteNode(Node root,int k){
        if(root==null){
            return null;
        }
        if(root.Data<k){
            root.Right=DeleteNode(root.Right, k);


        }else if(k<root.Data){
            root.Left=DeleteNode(root.Left, k);
        }
        else{
            if(root.Right==null && root.Left==null){
                return null;
            }
             if(root.Left==null){
                return root.Right;
            }
             if(root.Right==null){
                return root.Left;
            }
             // Here When Two Sides Are Aslo Null Then we need to Go to Right And Check for the Least Right Value tahst Left value 
             // Here Least Vlaue id left Value
             
            Node Curr=root.Right;
            while(Curr.Left!=null){
                Curr=Curr.Left;
            }
            root.Data=Curr.Data;
            // Here Comes One of the Edge Case Here we need to Very Care Full in the Sense 
            // While rEVSING i may doubt just Once Track thats All
            root.Right=DeleteNode(root.Right, Curr.Data);


        }
        return root;

        
    }
    public static void main(String[] args) {
        Node root= new Node(8);
        root.Left=new Node(3);
        root.Right=new Node(9);
        root.Left.Left=new Node(2);
        root.Left.Right=new Node(6);
        root.Right.Right=new Node(10);
        root.Left.Right.Left=new Node(5);
        root.Left.Right.Right=new Node(7);
        int k=3;

    }
    
}
