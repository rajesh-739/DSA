public class CircularLinkedList {
    private Node head;
    private Node tail;
    int length;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    CircularLinkedList(int data) {
        Node newNode = new Node(data);
        head = tail = newNode;
        tail.next = head;
    }
    void append(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        tail.next = head;
        length++;
    }
    void prepend(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            append(data);
        }
        else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        length++;
    }
    void traversal()
    {
        Node temp = head;
//
        while(temp.next != head) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
}
