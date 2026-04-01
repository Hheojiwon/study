package 백준;
import java.io.*;
import java.util.*;

public class baekjoon_20920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<>();

        for (int i=0; i<N; i++){
            String words = br.readLine();
            if (words.length() >= M){
                map.put( words, map.getOrDefault(words,0)+1);
            }
        }

        List<String> list = new ArrayList<>(map.keySet());

        Collections.sort(list, (a, b) ->{
            if (!map.get(a).equals(map.get(b)))
                return map.get(b) - map.get(a);
            if (a.length() != b.length())
                return b.length() - a.length();
            return a.compareTo(b);
        });

        StringBuilder sb = new StringBuilder();

        for (String s : list){
            sb.append(s+"\n");
        }

        System.out.print(sb);

    }
}
