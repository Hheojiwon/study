package 백준.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str= br.readLine().split("-");
        List<Integer> list= new ArrayList<>();
        for (String s : str){
            int sum = 0;
            String[] split= s.split("\\+");
            for (String s1 : split){
                sum+= Integer.parseInt(s1);
            }
            list.add(sum);
        }
        long answer = list.get(0);
        for (int i=1; i<list.size(); i++){
            answer-= list.get(i);
        }
        System.out.println(answer);
    }
}
