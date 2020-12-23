/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

class Solution0503 {

    public ListNode0501 removeElements(ListNode0501 head, int val) {

        ListNode0501 dummyHead = new ListNode0501(-1);
        dummyHead.next = head;

        ListNode0501 prev = dummyHead;
        while(prev.next != null){
            if(prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode0501 head = new ListNode0501(nums);
        System.out.println(head);

        ListNode0501 res = (new Solution0503()).removeElements(head, 6);
        System.out.println(res);
    }
}