package com.mapbar.misc;

import com.mapbar.office.ListNode;

public class RotateRight61 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return null;
        }
        ListNode p = new ListNode(0);
        p.next = head;
        int n = 0;
        while(p.next != null) {
            p = p.next;
            n++;
        }
        p.next = head;
        k = n - k % n + 1;
        for(int i = 0; i < k - 1; i++) {
            p = p.next;
        }
        head = p.next;
        p.next = null;
        return head;
    }
}
