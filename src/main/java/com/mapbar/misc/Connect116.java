package com.mapbar.misc;

import java.util.Map;

public class Connect116 {

    public Node connect(Node root) {
        //dfs(root, 0, new HashMap<Integer, Node>());
        dfs(root, null);
        return root;
    }

    public void dfs(Node node, Node next){
        if(node != null) {
            node.next = next;
            dfs(node.left, node.right);
            dfs(node.right, node.next == null ? null : node.next.left);
        }
    }

    public void dfs(Node node, int level, Map<Integer, Node> map) {
        if(node == null) {
            return ;
        }
        Node pre = map.get(level);
        if(pre == null) {
            map.put(level, node);
        } else{
            pre.next = node;
            map.put(level, node);
        }
        dfs(node.left, level + 1, map);
        dfs(node.right, level + 1, map);
    }
}
