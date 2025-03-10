package 백준.dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class baekjoon_2667 {

    static boolean isVisited[][];
    static int arr[][];
    static int count = 0, number = 0;
    static int nowX, nowY, N;
    static int dirX[] = {0, 0, -1, 1};
    static int dirY[] = {-1, 1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        isVisited = new boolean[N][N];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1 && !isVisited[i][j]) {
                    count = 0;
                    DFS(i, j);
                    list.add(count);
                }
            }
        }

        System.out.println(list.size());
        Collections.sort(list);


        for (int num : list) {
            System.out.println(num);
        }

    }

    public static void DFS(int x, int y) {
        isVisited[x][y] = true;
        arr[x][y] = number;
        count++;

        for (int i = 0; i < 4; i++) {
            nowX = dirX[i] + x;
            nowY = dirY[i] + y;

            if (nowX >= 0 && nowY >= 0 && nowX < N && nowY < N) {
                if (arr[nowX][nowY] == 1 && !isVisited[nowX][nowY]) {
                    DFS(nowX, nowY);
                }
            }
        }
    }
}
