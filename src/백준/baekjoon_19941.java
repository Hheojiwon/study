package 백준;

import java.io.*;

public class baekjoon_19941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] st = br.readLine().split(" ");
        int[] arr = new int[st.length];
        for (int i = 0; i < st.length; i++) {
            arr[i] = Integer.parseInt(st[i]);
        }
        int N = arr[0];
        int K = arr[1];
        String[] table = br.readLine().split("");

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (table[i].equals("P")) {
                for (int j = i - K; j <= i + K; j++) {
                    if (j >= 0 && j < N && table[j].equals("H")) {
                        count++;
                        table[j] = "X";
                        break;
                    }
                }
            }
        }
        System.out.println(count);


    }
}
