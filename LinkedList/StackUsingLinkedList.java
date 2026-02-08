class MyStack {

    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node top;

    public MyStack() {
        top = null;
    }

    public void push(int x){
        Node newNode = new Node(x);

        newNode.next = top; 
        top = newNode;
    }

    // Pop (remove from head)
    public int pop() {
        if(top == null) {
            return -1;
        }

        int val = top.val;
        top = top.next
        return val;
    }

    public int peek() {
        if (top == null) {
            return -1;
        }
        return top.val;
    }

    public boolean isEmpty() {
        return top == null;
    }

} 