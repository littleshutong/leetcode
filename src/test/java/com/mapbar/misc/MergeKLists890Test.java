package com.mapbar.misc;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeKLists890Test {

    private MergeKLists890 mergeKLists890 = new MergeKLists890();

    @Test
    public void mergeKLists() {
        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = new ListNode(1);
        listNodes[0].next = new ListNode(4);
        listNodes[0].next.next = new ListNode(5);

        listNodes[1] = new ListNode(1);
        listNodes[1].next = new ListNode(3);
        listNodes[1].next.next = new ListNode(4);

        listNodes[2] = new ListNode(2);
        listNodes[2].next = new ListNode(6);
        ListNode listNode = mergeKLists890.mergeKLists(listNodes);
        while(listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}