package com.mapbar.graph;

import com.mapbar.util.PrintUtil;

import java.util.*;

public class FindItinerary332 {

    /**
     * 使用java小顶堆代替排序
     * @param tickets
     * @return
     */
    public List<String> findItinerary3(List<List<String>> tickets) {
        // 因为逆序插入，所以用链表
        List<String> ans = new LinkedList<>();
        if (tickets == null || tickets.size() == 0)
            return ans;
        Map<String, PriorityQueue<String>> graph = new HashMap<>();
        for (List<String> pair : tickets) {
            // 因为涉及删除操作，我们用链表
            PriorityQueue<String> nbr = graph.computeIfAbsent(pair.get(0), k -> new PriorityQueue<>());
            nbr.add(pair.get(1));
        }
        visit3(graph, "JFK", ans);
        return ans;
    }

    // DFS方式遍历图，当走到不能走为止，再将节点加入到答案
    private void visit3(Map<String, PriorityQueue<String>> graph, String src, List<String> ans) {
        PriorityQueue<String> nbr = graph.get(src);
        while (nbr != null && nbr.size() > 0) {
            String dest = nbr.poll();
            visit3(graph, dest, ans);
        }
        ans.add(0, src); // 逆序插入
    }

    /**
     * 进行了排序
     * @param tickets
     * @return
     */
    public List<String> findItinerary2(List<List<String>> tickets) {
        // 因为逆序插入，所以用链表
        List<String> ans = new LinkedList<>();
        if (tickets == null || tickets.size() == 0)
            return ans;
        Map<String, List<String>> graph = new HashMap<>();
        for (List<String> pair : tickets) {
            // 因为涉及删除操作，我们用链表
            List<String> nbr = graph.computeIfAbsent(pair.get(0), k -> new LinkedList<>());
            nbr.add(pair.get(1));
        }
        // 按目的顶点排序
        graph.values().forEach(x -> x.sort(String::compareTo));
        visit(graph, "JFK", ans);
        return ans;
    }
    // DFS方式遍历图，当走到不能走为止，再将节点加入到答案
    private void visit(Map<String, List<String>> graph, String src, List<String> ans) {
        List<String> nbr = graph.get(src);
        while (nbr != null && nbr.size() > 0) {
            String dest = nbr.remove(0);
            visit(graph, dest, ans);
        }
        ans.add(0, src); // 逆序插入
    }


    /**
     * 自己实现
     * @param tickets
     * @return
     */
    public List<String> findItinerary(List<List<String>> tickets) {
        // 对tickets进行去重
        Set<String> set = new HashSet<>();
        for(List<String> ticket : tickets) {
           set.addAll(ticket);
        }
        // set变list
        List<String> locs = new ArrayList<>(set.size());
        for(String s : set) {
            locs.add(s);
        }
        // 排序节点
        Collections.sort(locs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char[] ch1 = o1.toCharArray();
                char[] ch2 = o2.toCharArray();
                for (int index = 0; index < ch1.length && index < ch2.length; index++) {
                    if (ch2[index] != ch1[index]) {
                        return ch1[index] - ch2[index];
                    }
                }
                return ch1.length - ch2.length > 0 ? 1 :  ch1.length == ch2.length ? 0 : -1;

            }
        });
        // 映射节点
        Map<String, Integer> nodes = new HashMap<>();
        Map<Integer, String> vnodes = new HashMap<>();
        for(int i = 0; i < locs.size(); i++) {
            nodes.put(locs.get(i), i);
            vnodes.put(i, locs.get(i));
        }
        // 初始化边信息
        int n = nodes.size();
        int [][] edges = new int[n][n];
        for(List<String> ticket : tickets) {
            edges[nodes.get(ticket.get(0))][nodes.get(ticket.get(1))] += 1;
        }
        this.n = tickets.size();
        dfs(edges, nodes.get("JFK"), new ArrayList<>());
        // 转换为字母
        List<String> res = new ArrayList<>();
        for(int a : pp) {
            res.add(vnodes.get(a));
        }
        res.add(0, "JFK");
        return res;
    }

    // 深度优先进行遍历
    private List<Integer> pp = new ArrayList<>();
    private int n;

    private void dfs(int[][] edges, int start, List<Integer> ans) {
        if(ans.size() == n) {
            pp = new ArrayList<>(ans);
            n = -1;
            return ;
        }
        if(ans.size() > n) {
            return ;
        }
        int[] next = edges[start];
        for(int i = 0; i < next.length; i++) {
            if(edges[start][i] > 0) {
                ans.add(i);
                edges[start][i]--;
                dfs(edges, i, ans);
                ans.remove(ans.size() - 1);
                edges[start][i]++;
            }
        }
    }
}


