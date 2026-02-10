package 백준.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] distanceArr = br.readLine().split(" ");
        String[] priceArr = br.readLine().split(" ");

        int[] distance = new int[N-1];
        int[] price = new int[N];


        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(priceArr[i]);
            price[i] = num;
        }

        for (int i = 0; i < N-1; i++) {
            int num = Integer.parseInt(distanceArr[i]);
            distance[i] = num;
        }

        int minPrice = price[0] * distance[0];
        int currentPrice = 0;

        for (int i = 1; i < price.length-1; i++) {
            currentPrice = price[i];
            if (currentPrice>=price[i-1]){
                currentPrice = price[i-1];
            }
            minPrice += currentPrice * distance[i];
        }

        System.out.println(minPrice);
    }
}
