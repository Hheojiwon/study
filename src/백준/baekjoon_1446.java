package 백준;
import java.io.*;
import java.util.*;

public class baekjoon_1446 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        List<int[]> list = new ArrayList<>();
        int distance = 0;
        int[] dist = new int[D+1];

        for (int i=0; i<N; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int[] path = new int[3];
            path[0] = Integer.parseInt(str.nextToken());
            path[1] = Integer.parseInt(str.nextToken());
            path[2] = Integer.parseInt(str.nextToken());
            list.add(path);
        }

        dist[0] = 0;
        dist[1] = 1;

        for (int i=2; i<=D; i++){
            dist[i] = dist[i-1]+1;
            for (int[] arr : list){
                if (arr[1] == i){
                    dist[i] = Math.min(dist[i],dist[arr[0]]+arr[2]);
                }
            }
        }
        System.out.println(dist[D]);
    }
}
