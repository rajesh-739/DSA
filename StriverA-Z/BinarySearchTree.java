public class BinarySearchTree {
    Node root;
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
    }
    boolean insert(int data,Node r) {
        if(r == null) {
            r = new Node(data);
            return true;
        }
        else if(r.data > data) {
            return insert(data,r.left);
        }
        else {
            return insert(data,r.right);
        }
    }
    void traversal(BST.Node temp) {
        if(temp == null) {
            return;
        }
        traversal(temp.left);
        System.out.println(temp.data);
        traversal(temp.right);
    }
//    boolean insert(int data)
//    {
//        Node newNode = new Node(data);
//        if(root == null)
//        {
//            root = newNode;
//            return true;
//        }
//        Node temp = root;
//        while (true) {
//            if(temp.data == newNode.data)
//            {
//                return false;
//            }
//            if(temp.data > newNode.data)
//            {
//                if(temp.left == null)
//                {
//                    temp.left = newNode;
//                    return true;
//                }
//                temp = temp.left;
//            }
//            else
//            {
//                if(temp.right == null)
//                {
//                    temp.right = newNode;
//                    return true;
//                }
//                temp = temp.right;
//            }
//        }
//    }

}
