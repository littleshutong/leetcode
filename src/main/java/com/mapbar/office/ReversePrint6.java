package com.mapbar.office;


import java.util.ArrayList;
import java.util.List;

public class ReversePrint6 {

    /**
     * 递归思想
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        List<Integer> ans = new ArrayList<>();
        dfs(head, ans);
        int[] arr = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }

    private void dfs(ListNode node, List<Integer> ans) {
        if(node == null) {
            return ;
        }
        dfs(node.next, ans);
        ans.add(node.val);
    }
}
