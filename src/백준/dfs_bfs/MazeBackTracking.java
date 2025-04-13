package 백준.dfs_bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MazeBackTracking {

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
    static List<int[]> path = new ArrayList<>();

    public static void main(String[] args) {
        if (backtrack(0,0)){
            System.out.println("경로 찾음");
            for (int[] p: path){
                System.out.println(p[0] + ","+p[1]);
            }
        }
        else{
            System.out.println("경로를 찾지 못함");
        }

    }

    static boolean backtrack(int x, int y){
        if (x<0 || y<0 || x>=n || y>=n || maze[x][y]==0 || isVisited[x][y]){
            return false;
        }
        isVisited[x][y]=true;
        path.add(new int[]{x,y});

        if (x== n-1 && y== n-1){
            return true;
        }

        for (int i=0; i<4; i++){
            if(backtrack(x+dx[i],y+dy[i]))
                return true;
            // 하나의 성공 경로를 찾으면 더이상 탐색하지 않는다.
        }

        path.remove(path.size()-1);
        isVisited[x][y]=false;
        return false;
    }
}
