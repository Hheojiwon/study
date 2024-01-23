package 백준.문자열;
import java.io.*;

/*
백준 11720번 - 브론즈 4
 */

public class baekjoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 첫번째 정수 N 입력 (string->int)
        String st = br.readLine();
        int sum = 0; // 정수의 합 초기값 0

        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(String.valueOf(st.charAt(i)));
            sum += A;
        }

        System.out.println(sum);

    }
}
