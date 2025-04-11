package 공부;

import java.util.HashMap;

public class HashMap_1 {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String key : str){
            map.put(key, map.getOrDefault(key,0)+1);
        }
    }
}
