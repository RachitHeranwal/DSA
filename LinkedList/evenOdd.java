package LinkedList;

public class evenOdd {
    public ListNode segregateEvenOdd(ListNode head) {

                if(head == null) return null;

                ListNode evenDummy = new ListNode(0);
                ListNode oddDummy = new ListNode(0);
                ListNode even = evenDummy;
                ListNode odd = oddDummy;
                ListNode temp = head;

                while(temp != null){
                    ListNode nextNode = temp.next;

                    if(temp.val % 2 == 0){
                        even.next = temp;
                        even = even.next;
                        even.next = null;
                    } else {
                        odd.next = temp;
                        odd = odd.next;  
                        odd.next = null;
                    }
                    temp = nextNode;
                }

                even.next = oddDummy.next;

                return evenDummy.next;
            }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {17, 15, 8, 12, 10, 5, 4};
        ListNode head = createList(arr);
        System.out.print("Original list: ");
        printList(head);

        evenOdd sol = new evenOdd();
        ListNode modifiedHead = sol.segregateEvenOdd(head);

        System.out.print("After segregation: ");
        printList(modifiedHead);
    }
}
