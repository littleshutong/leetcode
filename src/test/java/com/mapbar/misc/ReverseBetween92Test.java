package com.mapbar.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseBetween92Test {

    private ReverseBetween92 reverseBetween92 = new ReverseBetween92();

    @Test
    public void reverseBetween() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = reverseBetween92.reverseBetween(head, 2, 4);
        while(head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}