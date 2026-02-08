class MyQueue {
    
    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private Node front,rear;

    public MyQueue() {
        front = null;
        rear = null;
    }

    // Enqueue

   public void push(int x) {
        Node newNode = new Node(x);

        if(front == null){
            front = rear = null;
            return;
        }

        rear.next = newNode;
        rear = newNode;
   }

    // Dequeue
    public pop() {
        if(front == null) return -1;

        int val = front.val;
        front = front.next;

        if(front == null){
            rear = null;
        }
        return val;
    }  

    // Peek

    public int peek(){
        if(front == null) {
            return -1
        }
        return front.val;
    }

    public boolean empty(){
        return front == null;
    }

}