package 백준.dfs_bfs;

import java.util.LinkedList;

public class DFS_Graph {

    private int V;
    private LinkedList<Integer> adj[];

    DFS_Graph(int v){
        V = v;
        adj = new LinkedList[v];
        // v개의 LinkedList 선언 및 생성
        for (int i=0; i<v; ++i){
            adj[i]= new LinkedList();
        }
    }

    // 간선 추가
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void DFS(int v){
        boolean visited[] = new boolean[V]; // 각 노드의 방문 여부 저장
        recursiveDFS(v, visited);
    }

    void recursiveDFS(int v, boolean visited[]){
        visited[v] = true;
        // 현재 노드를 방문한 것으로 체크
        visited[v] = true;
        for (int n : adj[v]){
            if (!visited[n]){
                // 방문하지 않은 노드라면 재귀 호출
                recursiveDFS(n, visited);
            }
        }
    }
}
