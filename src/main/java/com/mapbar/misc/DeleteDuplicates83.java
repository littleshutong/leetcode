package com.mapbar.misc;

public class DeleteDuplicates83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head, q = head;
        while(q != null) {
            if(p.val != q.val) {
                p.next = new ListNode(q.val);
                p = p.next;
            }
            q = q.next;
        }
        return head;
    }
}
