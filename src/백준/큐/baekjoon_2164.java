package 백준.큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class baekjoon_2164 {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();

        for (int i=0; i<N; i++){
            q.add(i+1);
        }

        while (q.size()>1){
            q.poll();
            int num= q.poll();
            q.offer(num);
        }
        System.out.println(q.peek());
    }
}
