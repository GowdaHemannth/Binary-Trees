public class Height{
    // Here We are Going Find the The Hieght and Sum and Counting of thE nodes;
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
        static int Count=0;
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
    // Here we Are Going to find the hieght of the Nodes 
    public static int Hieght(Node root){
        if(root==null){
            return 0;
        }
        int l=Hieght(root.Left);
        int R=Hieght(root.Right);
        int H=Math.max(l, R)+1;
        return H;
    }
  // Here we are going to  Count the Nodes 
  public static int Count(Node root){
    if(root==null){
        return 0;
    }
    Count++; // if we are gonna Sum the Elemnts Then Sum=Sum+root.Data;
    int l=Count(root.Left);
    int R=Count(root.Right);
    return Count;

  }
    
    }

    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree T=new BinaryTree();
        Node root=T.PreorderTree(nodes);
        int Hieght=T.Hieght(root);
        int Count=T.Count(root);
        System.out.println(Hieght +" " + Count);
    }
}