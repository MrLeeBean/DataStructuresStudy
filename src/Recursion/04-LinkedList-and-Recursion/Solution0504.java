/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

class Solution0504 {

    public ListNode0501 removeElements(ListNode0501 head, int val) {

        if(head == null)
            return head;

        ListNode0501 res = removeElements(head.next, val);
        if(head.val == val)
            return res;
        else{
            head.next = res;
            return head;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode0501 head = new ListNode0501(nums);
        System.out.println(head);

        ListNode0501 res = (new Solution0504()).removeElements(head, 6);
        System.out.println(res);
    }
}