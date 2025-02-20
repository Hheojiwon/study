package 백준.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_10828 {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            if (input.contains("push")) {
                String[] strings = input.split(" ");
                int X = Integer.parseInt(strings[1]);
                stack.push(X);
            }
            if (input.equals("pop")) {
                System.out.println(stack.isEmpty() ? "-1" : stack.pop());
            }
            if (input.equals("size")) {
                System.out.println(stack.size());
            }
            if (input.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            if (input.equals("top")) {
                System.out.println(stack.isEmpty() ? "-1" : stack.peek());
            }
        }
    }
}
