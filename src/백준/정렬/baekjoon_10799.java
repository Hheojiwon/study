package 백준.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10799 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int answer = 0;
        int stick = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                if (input.charAt(i + 1) == ')') {
                    answer += stick;
                    i++;
                } else {
                    stick++;
                }
            } else {
                stick--;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
