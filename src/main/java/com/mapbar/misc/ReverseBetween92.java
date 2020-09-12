package com.mapbar.misc;

public class ReverseBetween92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m >= n) {
            return head;
        }
        ListNode p = new ListNode(0), pFront = p;
        p.next = head;
        int count = 1;
        while(p != null && count < m) {
            p = p.next;
            count++;
        }
        ListNode mNodeFront = p, nNodeFront = p.next;
        ListNode x, y, q = new ListNode(0);
        p = p.next;
        while(count <= n) {
            x = p;
            p = p.next;
            y = q.next;
            q.next = x;
            x.next = y;
            count++;
        }
        mNodeFront.next = q.next;
        nNodeFront.next = p;
        return pFront.next;
    }
}
