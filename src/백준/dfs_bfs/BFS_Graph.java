package 백준.dfs_bfs;

import java.util.LinkedList;

public class BFS_Graph {
    private int V;
    private LinkedList<Integer> adj[];

    BFS_Graph (int v){
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; i++){
            adj[i] = new LinkedList<>();
        }
    }

    // 간선 추가
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void BFS(int s){
        boolean visited[] = new boolean[V];

        //LinkedList는 Queue의 기능을 함
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (!queue.isEmpty()){

            // 큐에서 노드 추출 및 출력
            s = queue.poll();
            System.out.println(s + " ");

            // s랑 연결된 애들 다 불러오기
            for (int n : adj[s]){
                if (!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
