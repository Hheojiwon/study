package 백준.스택;
import java.util.Stack;

public class stack_study {
    public static void main(String[] args) {
        Stack<Integer> stackInt=new Stack<>();

        stackInt.push(1); //1 삽입
        stackInt.push(2); //2 삽입
        stackInt.push(3); //3 삽입
        stackInt.push(4); //4 삽입

        stackInt.pop(); //4 제거
        stackInt.pop(); //3 제거

        System.out.println(stackInt);
        System.out.println(stackInt.peek());
        System.out.println(stackInt.empty());
        System.out.println(stackInt.search(1));
        System.out.println(stackInt.size());
    }

}
