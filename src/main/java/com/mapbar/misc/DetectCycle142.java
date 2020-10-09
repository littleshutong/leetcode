package com.mapbar.misc;

public class DetectCycle142 {

    public ListNode detectCycle(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode p = head, q = head;
        while(true) {
            p = p.next;
            q = q.next;
            if(q != null && q.next != null) {
                q = q.next;
            } else {
                return null;
            }
            if(p == q) {
                break;
            }
        }
        p = head;
        while(p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
