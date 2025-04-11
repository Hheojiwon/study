package 백준.dfs_bfs;

import java.util.LinkedList;

/*
(예시 문제)
N×N 크기의 미로가 있다. 미로는 0과 1로 이루어져 있으며,
1은 이동할 수 있는 길, 0은 벽을 의미한다.
시작점은 항상 왼쪽 위 (0, 0)이고, 도착점은 오른쪽 아래 (N-1, N-1)이다.
현재 위치에서 상, 하, 좌, 우로만 이동할 수 있다.

1️⃣ (0,0)부터 출발해서 이동 가능한 모든 칸을 탐색하라.
2️⃣ 이동 가능한 칸을 방문 순서대로 출력하라.
3️⃣ 도착점 (N-1, N-1)에 도착할 수 있다면 “도착!”을 출력하라.
 */
public class DFS_study_2 {

    static int[][] maze ={
            {1,0,1,1},
            {1,1,1,0},
            {0,1,0,1},
            {1,1,1,1}
    };
    static int n = maze.length;
    static boolean[][] isVisited = new boolean[n][n];

    // 상하좌우 좌표
    static int[] dx= {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    static void DFS(int x, int y){
        if (x<0 || y<0 || x>=n || y>=n || maze[x][y]==0 || isVisited[x][y]){
            return;
        }
        isVisited[x][y] = true;
        System.out.println("("+x+","+y+")");

        if (x==n-1 && y==n-1){
            System.out.println("도착");
        }

        for (int i=0; i<4; i++){
            DFS(x+dx[i], y+dy[i]);
        }
    }
}
