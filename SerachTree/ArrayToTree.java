package SerachTree;
// Here we are craeting Binary Tree From aSorted Array
public class ArrayToTree {
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

    public static Node SortedArray(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node root=new Node(arr[mid]);
        root.left=SortedArray(arr, start, mid-1);
        root.right=SortedArray(arr, mid+1, end);
        
        return root;

    } 

    public static void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};

Node root=        SortedArray(arr, 0, arr.length-1);
        
        PreOrder(root);
    }
    
}
