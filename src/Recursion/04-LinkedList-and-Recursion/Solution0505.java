/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

class Solution0505 {

    public ListNode0501 removeElements(ListNode0501 head, int val) {

        if(head == null)
            return head;

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode0501 head = new ListNode0501(nums);
        System.out.println(head);

        ListNode0501 res = (new Solution0505()).removeElements(head, 6);
        System.out.println(res);
    }
}