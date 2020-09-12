package com.mapbar.office;

import com.mapbar.util.PrintUtil;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePrint6Test {

    private ReversePrint6 reversePrint6 = new ReversePrint6();

    @Test
    public void reversePrint() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        int[] arr = reversePrint6.reversePrint(head);
        Assert.assertArrayEquals(new int[]{2, 1, 0}, arr);

        head = new ListNode(0);
        arr = reversePrint6.reversePrint(head);
        Assert.assertArrayEquals(new int[]{0}, arr);
    }
}