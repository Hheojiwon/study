package 백준.큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class baekjoon_10845 {
    public static void main(String[] args) throws IOException {

        Queue<Integer> q = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int backNumber = 0;

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.contains("push")) {
                String[] strings = input.split(" ");
                backNumber = Integer.parseInt(strings[1]);
                q.offer(backNumber);
            }
            if (input.equals("pop")) {
                System.out.println(q.isEmpty() ? "-1" : q.poll());
            }
            if (input.equals("size")) {
                System.out.println(q.size());
            }
            if (input.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            }
            if (input.equals("front")) {
                System.out.println(q.isEmpty() ? "-1" : q.peek());
            }
            if (input.equals("back")) {
                System.out.println(q.isEmpty() ? "-1" : backNumber);
            }
        }
    }
}
