package LinkedList;
class isPalindromebro {
    public boolean isPalindrome(ListNode head) {
        // Edge case: empty or single node
        if (head == null || head.next == null) {
            return true;
        }

        // Step 1: Find the length
        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Find the node before the second half
        temp = head;
        for (int i = 0; i < (length - 1) / 2; i++) {
            temp = temp.next;
        }

        // Step 3: Reverse the second half starting from temp.next
        ListNode curr = temp.next;
        temp.next = null;  // Cut the list in half
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 4: Compare first half with reversed second half
        ListNode first = head;
        ListNode second = prev;

        while (second != null) {
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    // Helper method to create linked list from array
    public static ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }

        return head;
    }

}
