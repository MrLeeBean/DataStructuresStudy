/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

class Solution0501 {

    public ListNode0501 removeElements(ListNode0501 head, int val) {

        while(head != null && head.val == val){
            ListNode0501 delNode = head;
            head = head.next;
            delNode.next = null;
        }

        if(head == null)
            return head;

        ListNode0501 prev = head;
        while(prev.next != null){
            if(prev.next.val == val) {
                ListNode0501 delNode = prev.next;
                prev.next = delNode.next;
                delNode.next = null;
            }
            else
                prev = prev.next;
        }

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        ListNode0501 head = new ListNode0501(nums);
        System.out.println(head);

        ListNode0501 res = (new Solution0501()).removeElements(head, 6);
        System.out.println(res);
    }
}