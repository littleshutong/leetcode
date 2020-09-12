package com.mapbar.misc;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKLists890 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0), p = head;
        // 建立小顶堆，维护N个值
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for(int i = 0; i < lists.length; i++) {
            if(lists[i] != null) {
                heap.add(lists[i]);
            }
        }
        while(!heap.isEmpty()) {
            ListNode node = heap.poll();
            if(node != null) {
                p.next = node;
                p = node;
                if(node.next != null) {
                    heap.offer(node.next);
                }
            }
        }
        return head.next;
    }
}
