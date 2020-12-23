//Definition for singly-linked list.
public class ListNode0501 {

    public int val;
    public ListNode0501 next;

    public ListNode0501(int x) {
        val = x;
    }

    // 链表节点的构造函数
    // 使用arr为参数，创建一个链表，当前的ListNode为链表头结点
    public ListNode0501(int[] arr){

        if(arr == null || arr.length == 0)
            throw new IllegalArgumentException("arr can not be empty");

        this.val = arr[0];
        ListNode0501 cur = this;
        for(int i = 1 ; i < arr.length ; i ++){
            cur.next = new ListNode0501(arr[i]);
            cur = cur.next;
        }
    }

    // 以当前节点为头结点的链表信息字符串
    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        ListNode0501 cur = this;
        while(cur != null){
            s.append(cur.val + "->");
            cur = cur.next;
        }
        s.append("NULL");
        return s.toString();
    }
}