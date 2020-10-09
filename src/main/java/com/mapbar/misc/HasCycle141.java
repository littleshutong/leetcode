package com.mapbar.misc;

public class HasCycle141 {

    /**
     * 方法快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode p = head, q = head;
        while(q != null) {
            p = p.next;
            q = q.next;
            if(q != null) {
                q = q.next;
            } else {
                return false;
            }
            if(p == q) {
                return true;
            }
        }
        return false;
    }

    /**
     * 方法快慢指针
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if(head == null) {
            return false;
        }
        ListNode p = head, q = head;
        while(true) {
            p = p.next;
            q = q.next;
            if(q != null && q.next != null) {
                q = q.next;
            } else {
                return false;
            }
            if(p == q) {
                return true;
            }
        }
    }
}
