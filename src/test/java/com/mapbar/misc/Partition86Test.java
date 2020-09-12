package com.mapbar.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class Partition86Test {

    private Partition86 partition86 = new Partition86();

    @Test
    public void partition() {
        ListNode head = new ListNode(1);
        /*head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);*/
        ListNode p = partition86.partition(head, 3);
        while(p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}