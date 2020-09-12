package com.mapbar.misc;

public class Partition86 {

    public ListNode partition(ListNode head, int x) {
        if(head == null) {
            return null;
        }
        ListNode left = new ListNode(0), right = new ListNode(0), l = left, r =  right;
        while(head != null) {
            if(head.val < x) {
                left.next = new ListNode(head.val);
                left = left.next;
            } else {
                right.next = new ListNode(head.val);
                right = right.next;
            }
            head = head.next;
        }
        left.next = r.next;
        return l.next;
    }
}
