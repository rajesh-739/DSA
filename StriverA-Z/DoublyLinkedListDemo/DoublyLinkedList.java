package DoublyLinkedListDemo;

public class DoublyLinkedList{
    Node head;
    Node tail;
    int length;
    static class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
        }
    }
    DoublyLinkedList(int data) {
        Node newNode = new Node(data);
        head = tail = newNode;
        length =   1;
    }
    void prepend(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }
    void append(int data) {
        Node newNode  = new Node(data);
        if(head == null) {
            prepend(data);
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        length++;
    }
    void insert(int data,int index) {
        if(index > length || index < 0) {
            System.out.println("Index is invalid");
        }
        else if(index == length) {
            append(data);
        }
        else if(index == 0) {
            prepend(data);
        }
        else {
            Node temp = head;
            Node newNode = new Node(data);
            for(int i=0;i<index-1;i++) {
                temp = temp.next;
            }
            Node after = temp.next;
            temp.next = newNode;
            newNode.next = after;
            newNode.prev = temp;
            after.prev = newNode;
        }
        length++;
    }
    void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
        }
        else if(head.next == null) {
            head = tail = null;
        }
        else {
            Node temp = head;
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
    }
    void deleteLast() {
        if(head == null) {
            System.out.println("List is empty");
        }
        else if(head.next == null) {
            head = tail = null;
        }
        else {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
    }
    void deleteIndex(int index) {
        if(head == null) {
            System.out.println("List is empty");
        }
        else if(index == 0 || head.next == null) {
            deleteFirst();
        }
        else if(index == length-1 ) {
            deleteLast();
        }
        else {
            Node temp = head;
            for(int i=0;i<index-1;i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
            length--;
        }
    }
    void traversal() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    void reversal() {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            temp.next = temp.prev;
            temp.prev = t;
            temp = temp.prev;
        }
        temp = tail;
        tail = head;
        head = temp;
    }

    public int sum() {
        Node temp = head;
        int sum = 0;
        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }
        return sum;
    }
}