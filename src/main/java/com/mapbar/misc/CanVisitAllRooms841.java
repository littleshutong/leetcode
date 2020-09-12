package com.mapbar.misc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CanVisitAllRooms841 {

    boolean[] vis;
    int num;

    public boolean canVisitAllRooms2(List<List<Integer>> rooms) {
        int n = rooms.size();
        int num = 0;
        vis = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public void dfs(List<List<Integer>> rooms, int x) {
        vis[x] = true;
        num++;
        for (int it : rooms.get(x)) {
            if (!vis[it]) {
                dfs(rooms, it);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int[][] graph = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int room : rooms.get(i)) {
                graph[i][room] = 1;
            }
        }
        boolean[] visited = new boolean[n];
        dfs(graph, 0, n, visited);
        for(boolean visit : visited) {
            if(!visit) {
                return false;
            }
        }
        return true;
    }

    private void dfs(int[][] graph, int start, int n, boolean[] visited) {
        visited[start] = true;
        for(int i = 0; i < n; i++) {
            if(graph[start][i] > 0 && !visited[i]) {
                visited[i] = true;
                dfs(graph, i, n, visited);
            }
        }
    }
}
