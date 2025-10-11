package LinkedList;

public class mergeLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode mergedHead = dummy; // keep reference to head for printing

        System.out.println("Starting merge process...");
        System.out.println("Initial temp1: " + (temp1 != null ? temp1.val : "null"));
        System.out.println("Initial temp2: " + (temp2 != null ? temp2.val : "null"));

        while (temp1 != null && temp2 != null) {
            System.out.println("Comparing " + temp1.val + " and " + temp2.val);
            if (temp1.val <= temp2.val) {
                System.out.println("Values equal: " + temp1.val);
                dummy.next = temp1;
                dummy = dummy.next;
                temp1 = temp1.next;
                System.out.println("Added " + dummy.val + " from list1");
            } else {
                System.out.println("Taking from list2: " + temp2.val);
                dummy.next = temp2;
                dummy = dummy.next;
                temp2 = temp2.next;
            }

            // Print current merged list
            System.out.print("Merged list now: ");
            ListNode current = mergedHead.next;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }

        while (temp1 != null) {
            dummy.next = temp1;
            dummy = dummy.next;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            dummy.next = temp2;
            dummy = dummy.next;
            temp2 = temp2.next;
        }

        System.out.println("Merging complete. Returning merged list.");
        return mergedHead.next;
    }

    // Helper method to build a linked list from an array
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

    // Helper method to print a linked list
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
        mergeLinkedList solution = new mergeLinkedList();
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};

        ListNode list1 = buildList(arr1);
        ListNode list2 = buildList(arr2);

        System.out.print("List 1: ");
        printList(list1);
        System.out.print("List 2: ");
        printList(list2);

        ListNode merged = solution.mergeTwoLists(list1, list2);

        System.out.print("Merged list: ");
        printList(merged);
    }
}

