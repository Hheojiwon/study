package 백준.dfs_bfs;

import java.util.LinkedList;

public class DFS_study {

    static class Graph{
        // 전체 정점 개수
        private int V;
        // 연결리스트를 통한 간선
        private LinkedList<Integer> adj[];
        // 방문 여부 체크 배열
        private boolean[] visited;

        Graph(int v){
            V = v;
            adj = new LinkedList[v+1];
            for(int i=1; i<=v; i++){
                adj[i] = new LinkedList<>();
            }
        }

        //양방향 간선으로 연결
        void addEdge(int v, int w){
            adj[v].add(w);
            adj[w].add(v);
        }

        void DFS(int nodeIndex){
            //현재 노드를 방문 처리 한다.
            visited[nodeIndex] = true;

            //방문한 노드를 출력한다.
            System.out.println(nodeIndex+" ");

            //현재 노드와 인접한 모든 노드 탐색
            for (int neighbor : adj[nodeIndex]){
                if (!visited[neighbor]){
                    DFS(neighbor);
                }
            }
        }
    }
}
