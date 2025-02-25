public class Vertical {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info implements Comparable<Info> { // Fixed class name capitalization
        Node node;
        int HD;

        public Info(Node node, int HD) {
            this.node = node;
            this.HD = HD;
        }

        @Override
        public int compareTo(Info i2) { // Fixed method name
            return this.HD - i2.HD;
        }
    }

    public static void main(String[] args) {
        // Your code execution here
    }
}
