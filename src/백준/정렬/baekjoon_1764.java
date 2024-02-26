package 백준.정렬;
import java.io.*;
import java.util.*;

/*
백준 1764번(듣보잡) - 실버 4

김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과,
N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.
듣보잡의 수와 그 명단을 사전순으로 출력한다.

 */

public class baekjoon_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());


        String[] str=new String[N];
        ArrayList<String> list=new ArrayList<String>(); //배열 리스트 사용
        HashSet<String> stringHashSet=new HashSet<>(); //Hashset 사용 (중복 X, 값 순서대로 저장 X)

        for (int i=0;i<N;i++){
            stringHashSet.add(br.readLine());
        }

        for (int i=0;i<M;i++){
            String s=br.readLine();
            if(stringHashSet.contains(s)) //stringHashSet 이 S 값을 포함하고 있으면
                list.add(s); //list에 s 추가
        }

        Collections.sort(list); //사전순으로 정렬
        System.out.println(list.size());

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
