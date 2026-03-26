package 백준;
import java.io.*;
import java.util.*;

public class baekjoon_12865 {
    static List<Integer> arr[];
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] warr = new int[N];
        int[] varr= new int[N];
        for (int i=0; i<N; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());
            int w =Integer.parseInt(str.nextToken());
            int v= Integer.parseInt(str.nextToken());
            warr[i] = w;
            varr[i] = v;
            map.put(w,v);
        }
        int cum = N;

        while (cum >= 0){
            for (int i : warr){
                if (cum >=0){
                    cum -= i;
                }

            }
        }


    }
    }


