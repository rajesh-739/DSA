public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;
    SinglyLinkedList(T data) {
        Node<T> newNode = new Node<>(data);
        head = newNode;
        tail = newNode;
        length=1;
    }
    void insertAtEnd(T data) {
        Node<T> node = new Node<>(data);

        if(head == null) {
            head = tail = node;
            length++;
            return;
        }
        tail.next = node;
        tail = node;
        tail.next = null;
        length++;
    }

    public int getLength() {
        return length;
    }

    public Node<T> getHead() {
        return head;
    }
    void traversal()
    {
        Node<T> temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    void insertAtBeginning(T data) {
        if(head == null) {
            insertAtEnd(data);
            length++;
            return;
        }
        Node<T> node = new Node<>(data);
        node.next = head;
        head = node;
        length++;
    }
    void insertAtPosition(T data,int pos)
    {
        Node<T> n = new Node<>(data);
        if(pos == 0) {
            insertAtBeginning(data);
            return;
        }
        if(pos == length)
        {
            insertAtEnd(data);
            return;
        }
        if(pos < 0 ) {
            System.out.println("Invalid Position to Insert");
            return;
        }
        Node<T> before=head,after;
        for(int i=0;i<pos-1;i++) {
            before = before.next;
        }
        after = before.next;
        before.next = n;
        n.next = after;
        length++;
    }
    void deleteFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        length--;
    }
    void deleteLast() {
        Node<T> temp = head;
        if(head == null) {
            deleteFirst();
            return;
        }
        while (temp.next != tail) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        length--;
    }
    void deleteAtPos(int pos) {
        if(pos == 0) {
            deleteFirst();
        } else if (pos == length) {
            deleteLast();
        } else if (pos < 0 || pos > length) {
            System.out.println("Invalid position");
        }
        else {
            Node<T> temp = head;
            for(int i =0;i<pos-1;i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            length--;
        }
    }
}
