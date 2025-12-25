import java.util.HashMap;


// ONLY THING ABOUT THESE TWO NUMRICAL LIKE CONSTRUCT AND CONSTRUCT1 IS WE NEED O DRY RUN IT
public class Construct2 {
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

  public static Node buildtree(int [] Inorder,int [] Postrder){
    HashMap<Integer,Integer>Map=new HashMap<>();
    for (int i=0;i<Inorder.length;i++){
        Map.put(Inorder[i], i);

    }
    Node root=build(Inorder,0,Inorder.length-1,Postrder,0,Postrder.length-1,Map);
    return root;
  }
  
  public static Node build(int [] Inorder,int InStart,int InEnd,int [] Postrder,int PoStart,int PoEnd, HashMap<Integer,Integer>Map){
    if(InStart>InEnd||PoStart>PoEnd){
        return null;
    }

    Node root=new Node(Postrder[PoEnd]);
    int RootValue=Map.get(Postrder[PoEnd]);
    int Numsleft=RootValue-InStart;

    root.Left=build(Inorder, InStart, RootValue-1, Postrder, PoStart, PoStart+Numsleft-1,Map);
    root.Right=build(Inorder, RootValue+1, InEnd, Postrder,Numsleft+PoStart, PoEnd, Map);
    return root;
  }
    public static void main(String[] args) {
         int[] Inorder = {9, 3, 15, 20, 7};
        int[] Postrder = {3, 9, 20, 15, 7};
    }
    
}
