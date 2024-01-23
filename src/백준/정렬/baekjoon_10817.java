package 백준.정렬;
import java.io.*;
import java.util.StringTokenizer;

/*
백준 10817번 - 브론즈 3
 */

public class baekjoon_10817 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        StringTokenizer st=new StringTokenizer(str);
        int[] arr=new int[3];

        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken()); //st값 토큰으로 분리, int 형으로 변환
        }

        int temp=arr[0]; //값 저장할 변수 temp


        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println(arr[1]);









    }
}
