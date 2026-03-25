package 백준;
import java.io.*;
import java.util.*;

public class baekjoon_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            arr[i][0] = X;
            arr[i][1] = Y;
        }


        int[] rank = new int[N];

        for (int i=0; i<N; i++){
            int count = 0;
            for (int j=0; j<N; j++){
                if (arr[i][0] < arr[j][0] && arr[i][1]<arr[j][1]){
                    count ++;
                }
            }
            rank[i] = count+1;
        }

        StringBuilder sb = new StringBuilder();
        for (int number : rank){
            sb.append(number+" ");
        }

        System.out.println(sb);

    }
}
