package LinkedList;


public class Duplicates {
    public ListNode ddeleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next != null) {
            ListNode damm = temp.next;
            ListNode same = new ListNode(0);

            if (temp.val != damm.val) {
                temp = temp.next;
            } else {
                while (temp.val == damm.val) {
                    same = damm;
                    if (damm.next != null) {
                        damm = damm.next;
                    } else {
                        temp.next = null;
                        temp = damm;
                        break;
                    }
                }
                if (temp.next != null) {
                    temp.next = damm;
                    same.next = null;
                    temp = damm;
                }
            }
        }

        return head;
    }


    // Optional: Helper method to build a linked list from an array
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Optional: Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Test the method
    public static void main(String[] args) {
        Duplicates solution = new Duplicates();
        int[] values = {1, 3, 4, 4};
        ListNode head = buildList(values);
        System.out.print("Original list: ");
        printList(head);

        head = solution.ddeleteDuplicates(head);

        System.out.print("After removing duplicates: ");
        printList(head);
    }
}

