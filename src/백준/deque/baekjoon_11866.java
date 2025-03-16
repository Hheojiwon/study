package 백준.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class baekjoon_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        ArrayDeque<Integer> deque = new ArrayDeque<>();


        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K - 1; j++) {
                int num = deque.pollFirst();
                deque.addLast(num);
            }
            int num2 = deque.pollFirst();
            answer.add(num2);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            if (i != answer.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);

    }
}
