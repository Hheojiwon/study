package 백준.문자열;
import java.io.*;

/*
백준 11720번(숫자의 합) - 브론즈 4

문제
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
입력으로 주어진 숫자 N개의 합을 출력한다.
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
