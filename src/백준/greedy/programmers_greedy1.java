package 백준.greedy;


import java.util.Arrays;
import java.util.HashSet;


public class programmers_greedy1 {
    public static void main(String[] args) {
        int N = 5;
        int[] lost = {2, 4};
        int[] reserve = {3};

        System.out.println(solution(N, lost, reserve));

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        HashSet<Integer> lostSet = new HashSet<>();
        HashSet<Integer> reserveSet = new HashSet<>();

        for (int i : lost) {
            lostSet.add(i);
        }
        for (int i : reserve) {
            if (lostSet.contains(i)) {
                lostSet.remove(i);
            } else {
                reserveSet.add(i);
            }
        }

        Arrays.sort(lost);

        for (int k : lost) {
            if (reserveSet.contains(k - 1)) {
                reserveSet.remove(k - 1);
                lostSet.remove(k);
            } else if (reserveSet.contains(k + 1)) {
                reserveSet.remove(k + 1);
                lostSet.remove(k);
            }
        }
        answer = n - lostSet.size();
        return answer;
    }
}
