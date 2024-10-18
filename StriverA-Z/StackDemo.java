public class StackDemo {
    private final int []  arr = new int[100];
    int top = -1;
    StackDemo(int data) {
        top++;
        arr[top] = data;
    }
    int getTop() {
        return arr[top];
    }
    void traverse() {
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    void push(int data) {
        arr[++top] = data;
    }
    int pop() {
        return arr[top--];
    }
}
