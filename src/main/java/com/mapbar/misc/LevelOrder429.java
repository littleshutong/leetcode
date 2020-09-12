package com.mapbar.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LevelOrder429 {

    public class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        dfs(0, map, root);
        ans.addAll(map.values());
        return ans;
    }

    public void dfs(int level, Map<Integer, List<Integer>> map, Node node) {
        if(node == null) {
            return ;
        }
        List<Integer> temp = map.getOrDefault(level, new ArrayList<>());
        temp.add(node.val);
        for(Node child : node.children) {
            dfs(level + 1, map, child);
        }
    }
}
