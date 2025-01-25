package 백준.큐;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_study {
    public static void main(String[] args) {
        Deque<Integer> queue= new LinkedList<>();
        int[] arr;
        arr = new int[]{1, 1, 3, 3, 0, 0};

        for (int i=0; i<arr.length; i++){
            int N= arr[i];
            if (queue.isEmpty() ){
                queue.addFirst(N);
            }
            else{
                if (N!=queue.getFirst()){
                    queue.addFirst(N);
                }
            }
        }
        int[] answer= new int[queue.size()];
        int size= queue.size();
        for (int i=0; i<size;i++){
            int N = queue.pollLast();
            answer[i]= N;
            System.out.print(answer[i]+" ");
        }
    }
}
