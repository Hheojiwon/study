package 백준.분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());
        System.out.println(number(a, b, c));
    }

    public static long number(long a, long b, long c) {
        if (b == 1) {
            return a % c;
        } else {
            long temp = number(a, b / 2, c);
            if (b % 2 == 1) {
                return (temp * temp % c) * a % c;
            }
            return temp * temp % c;
        }
    }

}
