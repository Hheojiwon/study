package 백준.스택;
import java.util.Stack;
import java.io.*;

/*
백준 17608(막대기) - 브론즈 2

문제
높이만 다르고 (같은 높이의 막대기가 있을 수 있음) 모양이 같은 막대기를
일렬로 세운 후, 왼쪽부터 차례로 번호를 붙인다.
일렬로 세워진 막대기를 오른쪽에서 보면 보이는 막대기가 있고 보이지 않는 막대기가 있다.
즉, 지금 보이는 막대기보다 뒤에 있고 높이가 높은 것이 보이게 된다.
N개의 막대기에 대한 높이 정보가 주어질 때,
오른쪽에서 보아서 몇 개가 보이는지를 알아내는 프로그램을 작성하려고 한다.
첫 번째 줄에는 막대기의 개수를 나타내는 정수 N (2 ≤ N ≤ 100,000)이 주어지고
이어지는 N줄 각각에는 막대기의 높이를 나타내는 정수 h(1 ≤ h ≤ 100,000)가 주어진다.
 */


public class baekjoon_17608 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N=Integer.parseInt(br.readLine());

        Stack<Integer> stack=new Stack<>(); //스택

        for (int i=0;i<N;i++){
            int h=Integer.parseInt(br.readLine());
            while(!stack.isEmpty() &&stack.peek()<=h){
                // 스택이 비어있지 않고, 현재 막대기 높이가 입력받은 막대기 높이보다
                // 작거나 같은 경우 반복
                // EmptyStackException 주의
                stack.pop(); //현재 막대기 삭제
            }
            stack.push(h); //입력받은 막대기 삽입
        }

        System.out.println(stack.size()); //스택 크기 = 막대기의 개수

    }
}
