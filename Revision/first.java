package Revision;

// Here we will be creating Binary tree for a refernce in jaav 

public class first {
    static class Node{
        int data;
        // Here you might a Question like why do we need to Write it Has node in the initialization of 
        // -->>> Important  Left actully gives refernce to the next Node so it will be Defined as Node Left
        Node Left;
        Node Right ;
        public Node(int data){
            this.data =data;
            this.Left=null;
            this.Right=null;
        }

    }
    public static void main(String[] args) {
        
    }
    
}
