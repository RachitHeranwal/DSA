package LinkedList;

public class Main {

    public static void main(String[] args) {

        // Test Case 1: [7,7,7,7], remove 7
        System.out.println("Test Case 1: [7,7,7,7], remove 7");
        ListNode head1 = new ListNode(7);
        head1.next = new ListNode(7);
        head1.next.next = new ListNode(7);
        head1.next.next.next = new ListNode(7);
        System.out.print("Original: ");
        printList(head1);
        ListNode result1 = removeElements(head1, 7);
        System.out.print("After removal: ");
        printList(result1);
        System.out.println();

        // Test Case 2: [1,2,6,3,4,5,6], remove 6
        System.out.println("Test Case 2: [1,2,6,3,4,5,6], remove 6");
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(3);
        head2.next.next.next.next = new ListNode(4);
        head2.next.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next.next = new ListNode(6);
        System.out.print("Original: ");
        printList(head2);
        ListNode result2 = removeElements(head2, 6);
        System.out.print("After removal: ");
        printList(result2);
        System.out.println();

        // Test Case 3: [1], remove 1
        System.out.println("Test Case 3: [1], remove 1");
        ListNode head3 = new ListNode(1);
        System.out.print("Original: ");
        printList(head3);
        ListNode result3 = removeElements(head3, 1);
        System.out.print("After removal: ");
        printList(result3);
        System.out.println();

        // Test Case 4: [1,2,3,4,5], remove 6 (value not present)
        System.out.println("Test Case 4: [1,2,3,4,5], remove 6");
        ListNode head4 = new ListNode(1);
        head4.next = new ListNode(2);
        head4.next.next = new ListNode(3);
        head4.next.next.next = new ListNode(4);
        head4.next.next.next.next = new ListNode(5);
        System.out.print("Original: ");
        printList(head4);
        ListNode result4 = removeElements(head4, 6);
        System.out.print("After removal: ");
        printList(result4);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;

        while(temp.next != null) {
            if(temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return dummy.next;
    }
    public static void printList(ListNode head) {
        if(head == null) {
            System.out.println("[]");
            return;
        }

        System.out.print("[");
        ListNode current = head;
        while(current != null) {
            System.out.print(current.val);
            if(current.next != null) {
                System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }
}
