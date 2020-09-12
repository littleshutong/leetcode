package com.mapbar.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteDuplicates83Test {

    private DeleteDuplicates83 deleteDuplicates83 = new DeleteDuplicates83();

    @Test
    public void deleteDuplicates() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        ListNode p = deleteDuplicates83.deleteDuplicates(head);
        while(p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}