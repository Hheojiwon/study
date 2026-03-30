package 백준;

import java.io.*;
import java.util.*;

public class baekjoon_17484 {

    static int[][][] dp;
    static int[] dirX = {-1, 0, 1};
    static int INF = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] board = new int[N][M];
        dp = new int[N][M][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(str.nextToken());
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] = INF;
                }
            }
        }

        for (int j = 0; j < M; j++) {
            for (int k = 0; k < 3; k++) {
                dp[0][j][k] = board[0][j];
            }
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < M; j++) {
                for (int k = 0; k < 3; k++) {

                    int fromY = i - 1;
                    int fromX = j - dirX[k];
                    if (fromX < 0 || fromX >= M) continue;
                    for (int t = 0; t < 3; t++) {
                        if (k == t) continue;
                        dp[i][j][k] = Math.min(dp[i][j][k], dp[fromY][fromX][t] + board[i][j]);
                    }
                }
            }
        }
        int answer = INF;

        for (int j = 0; j < M; j++) {
            for (int k = 0; k < 3; k++) {
                answer = Math.min(answer, dp[N - 1][j][k]);
            }
        }


        System.out.println(answer);


    }
}
