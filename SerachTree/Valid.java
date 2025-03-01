package SerachTree;



public class Valid { 
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
// Cheking Whther the tree is Valid Or Not
public static boolean isValidBST(Node root,Node min,Node max){
    if(root==null){
        return true;
    }
    if(min!=null&&root.data<=min.data){
        return false;
    } if(max!=null&&root.data>=max.data){
        return false;
    }
    return isValidBST(root.left, min, max)&&isValidBST(root.right, min, max);
}
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);  // Update root after insertion
        }
        if(isValidBST(root, null, null)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
