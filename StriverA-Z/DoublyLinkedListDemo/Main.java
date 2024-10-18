package DoublyLinkedListDemo;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(23);
        dll.append(24);
        dll.append(45);
        dll.append(90);
        dll.prepend(12);
        dll.traversal();
        dll.reversal();
        dll.traversal();
        System.out.println(dll.sum());
    }
}
