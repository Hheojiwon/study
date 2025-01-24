package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon_1260 {

    static int N, M, V;
    static ArrayList<Integer> graph[];
    static boolean isVisited[];

    public static void dfs(int v) {
        if (isVisited[v] == false) {
            System.out.print(v + " ");
            isVisited[v] = true;
        }
        for (int i = 0; i < graph[v].size(); i++) {
            if (isVisited[graph[v].get(i)]) continue;
            dfs(graph[v].get(i));
        }
    }

    public static void bfs(int root) {
        Queue<Integer> queue= new ArrayDeque<Integer>();
        queue.add(root);
        isVisited[root] = true;

        while(!queue.isEmpty()){
            int node = queue.poll();
            System.out.print(node+ " ");

            for (int i=0; i<graph[node].size(); i++){
                if (isVisited[graph[node].get(i)]==true) continue;
                queue.add(graph[node].get(i));
                isVisited[graph[node].get(i)]=true;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int V = Integer.parseInt(str[2]);

        graph= new ArrayList[N+1];
        for (int i=0; i<N+1; i++) graph[i]= new ArrayList<Integer>();
        for (int i=0; i<M; i++){
            String[] st= br.readLine().split(" ");
            int v1 = Integer.parseInt(st[0]);
            int v2 = Integer.parseInt(st[1]);
            graph[v1].add(v2);
            graph[v2].add(v1);
        }

        for (int i=0; i<N+1; i++) Collections.sort(graph[i]);
        isVisited = new boolean[N+1];
        dfs(V);
        System.out.println();

        isVisited = new boolean[N+1];
        bfs(V);


    }
}
