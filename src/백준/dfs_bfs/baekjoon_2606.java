package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class baekjoon_2606 {

    static boolean[] isVisited;
    static ArrayList<Integer> graph[];
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        graph = new ArrayList[N + 1];
        count = 0;
        isVisited = new boolean[N + 1];

        for (int i = 0; i < graph.length; i++) graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String[] str = br.readLine().split(" ");
            int v1 = Integer.parseInt(str[0]);
            int v2 = Integer.parseInt(str[1]);
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        dfs(1);
        System.out.println(count - 1);
    }

    public static void dfs(int v) {
        if (!isVisited[v]) {
            isVisited[v] = true;
            count++;
            for (int i = 0; i < graph[v].size(); i++) {
                dfs(graph[v].get(i));
            }
        }
    }
}
