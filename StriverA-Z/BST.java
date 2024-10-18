public class BST {
    Node root;
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;
        }
    }
    void insert(int data) {
        root = insertNode(data,root);
    }
    Node insertNode(int data,Node r) {
        if(r == null ) {
            return new Node(data);
        }
        else if(r.data > data) {
            r.left = insertNode(data,r.left);
        }
        else {
            r.right = insertNode(data,r.right);
        }
        return r;
    }
    void traversal() {
        traverse(root);
    }
    void traverse(Node temp) {
        if(temp == null) {
            return;
        }
        traverse(temp.left);
        System.out.println(temp.data);
        traverse(temp.right);
    }
}
