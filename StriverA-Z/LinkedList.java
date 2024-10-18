public class LinkedList {
    private Node head;
    private Node tail;
    private int length=0;

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedList(int data) {
        Node newNode = new Node(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    void getHead() {
        if (head != null)
            System.out.println("Head Value :" + head.data);
        else
            System.out.println("Head is Null");
    }

    void getTail() {
        if (head == null)
            System.out.println("Tail is Null");
        else
            System.out.println("Tail Value :" + tail.data);
    }

    void printList() {
        if (head == null)
            System.out.println("List is Empty");
        else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data+" --> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }
    void append(int data) {
        Node newNode = new Node(data);
        if(length == 0)
        {
            head = newNode; 
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    Node deleteLast() {
        if(length == 0) return null;
        if(length == 1) head = tail = null;
        Node pre = get(length - 2);
        Node temp = pre.next;
        pre.next = null;
        temp.next = null;
        return temp;
    }
    void delete(int value){
        if(length == 0 || length == 1 || tail.data == value)
            deleteLast();  
        else {
            Node current = head;
            while(current.next.data != value) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        length--;
    }
    void insert(int data,int index) {
        int i = 0;
        Node newNode = new Node(data);
        Node current = head;
        Node pre = head;
        if(index == 0)
        {
            newNode.next = head;
            head = newNode;
        }
        else if(index == length) {
            append(data);
        }
        else {
            while(i<index) {
                pre = current;
               current = current.next;
                i++;
            }
            pre.next = newNode;
            newNode.next = current;
        }
        length++;
    }
    void replace(int data,int val) {
        Node currNode = head;
        while(currNode.data != data) {
            currNode = currNode.next;
        }
        currNode.data = val;
    }
    Node get(int index) {
        if(index < 0 || index > length) 
            return null;
        else {
            Node temp = head;
            int i =0;
            while(i<index) {
                temp = temp.next;
                i++;
            }
            return temp;
        } 

    }
    void getlength() {
        System.out.println("Length : "+length);
    }
    void setValThroughIndex(int index,int val) {
        if(index > length || index < 0) 
            System.out.println("Invalid Index is Provide");
        else {
            Node temp = get(index);
            temp.data = val;
        }
    }
    void reverse() {
        if(length == 1 || length == 0)
            return;
        Node temp = head;
        head = tail;
        tail = temp;
        Node before = null;
        Node after = temp.next;
        for(int i=0;i<length;i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
    boolean hasLoop(){
        if(length == 0) 
            return false;
        Node slow,fast;
        slow = fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
}