package 백준;
import java.io.*;

public class baekjoon_1522 {

    //a가 연속적이어야 한다. a가 -> a의 개수만큼 연속으로 위치해야한다.
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String doubled = s + s;

        int count = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='a') count ++;
        }


        int min = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            int bCount = 0;

            for (int j = i; j < i + count; j++) {
                if (doubled.charAt(j) == 'b') {
                    bCount++;
                }
            }

            min = Math.min(min, bCount);
        }

        System.out.println(min);


    }
}
