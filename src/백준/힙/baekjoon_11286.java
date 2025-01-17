package 백준.힙;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class baekjoon_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap= new PriorityQueue<>(
                ((o1, o2) -> {
                    if (Math.abs(o1) == Math.abs(o2)){
                        return o1 > o2 ? 1: -1;
                    }else{
                        return Math.abs(o1) - Math.abs(o2);
                        // comparator 사용해서 o1, o2 비교
                        // o1 < o2 이면 음수, o1이 앞에 배치됨
                        // o1 > o2 이면 양수, o2가 앞에 배치됨
                        // 절댓값 오름차순 정렬이 이루어짐
                    }
                })
        );

        for (int i=0; i<N; i++){
            int X = Integer.parseInt(br.readLine());
            if (X==0){
                if (heap.isEmpty()) heap.add(0);
                System.out.println(heap.poll());
            }
            else heap.add(X);
        }
    }
}
