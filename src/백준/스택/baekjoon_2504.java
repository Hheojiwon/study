package 백준.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class baekjoon_2504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();
        int sum = 0;
        int num = 1;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                num *= 2;
                stack.push(ch);
            }
            if (ch == '[') {
                num *= 3;
                stack.push(ch);
            }
            if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    sum = 0;
                    break;
                } else if (input.charAt(i - 1) == '(') {
                    sum += num;
                }
                stack.pop();
                num /= 2;
            }
            if (ch == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    sum = 0;
                    break;
                } else if (input.charAt(i - 1) == '[') {
                    sum += num;
                }
                stack.pop();
                num /= 3;
            }
        }
        if (!stack.isEmpty()) sum = 0;
        System.out.println(sum);

    }
}
