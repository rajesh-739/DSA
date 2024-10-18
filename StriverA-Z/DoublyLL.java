public class DoublyLL<T> {
    private Node head;
    private Node tail;
    private int length;
    class Node 
    {
        Node prev;
        T data;
        Node next;
        
        Node(T data) {
            this.data = data;
            length = 1;
        }
    }
    
    public DoublyLL(T data) {
        Node newnNode = new Node(data);
        newnNode.data = data;
        head = tail = newnNode;
        newnNode.prev = newnNode.next = null;
    }
    public DoublyLL() {
        
    }
    public Node getHead() 
    {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public void printList() 
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void addLast(T data) 
    {
        Node newnode = new Node(data);
        if(head == null) {
            head = newnode;
        }
        else {
            tail.next = newnode;
            newnode.prev = tail;
            tail = tail.next;
        }
        length++;
    }
    public Node get(int index)
    {
        if(index == 0) return null;
        Node temp;
        if(index < length/2)
        {
            temp = head;
            for(int i=0;i<index;i++)
            {
                temp = temp.next;
            }
        }
        else
        {
            temp = tail;
            for(int i=length-1;i>index;i--)
            {
                temp = temp.prev;
            }
        }
        return temp;
    }
    public void deleteLast()
    {
        if(head.next == null) {
            head = tail = null;
            return;
        }
        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
    }
    public void printReverse()
    {
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public void addFirst(T data)
    {
        if(head == null) {
            addLast(data);
            return;
        }
        Node newnode = new Node(data);
        newnode.prev = null;
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        length++;
    }
    public void add(T data,int index) {
        if(index > length) return;
        Node n = new Node(data);
        if(index == 0) 
        {
            addFirst(data);
            return;
        }
        if(head == null){
            head = tail = n;
        }
        else if(length == index){
            addLast(data);
            return;
        }
        length++;
    }
    public void getLength() {
        System.out.println(length);
    }
}