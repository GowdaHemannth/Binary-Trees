public class PreOrder{
    // Here We are Building The Preorder Traversel Tree ;
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
    static class BinaryTree{
        static int Idx=-1;
    public static Node PreorderTree(int nodes[]){
        Idx++;
        if(nodes[Idx]==-1){
            return null;
        }
        Node newNode=new Node(nodes[Idx]);
        newNode.Left=PreorderTree(nodes);
        newNode.Right=PreorderTree(nodes);
        return newNode;
    }
    }
    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,-5,-1,-1,3,-1,6,-1,-1};
        BinaryTree T=new BinaryTree();
        Node root=T.PreorderTree(nodes);
    }
}