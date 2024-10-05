import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        ArrayList<Integer> str_arr = new ArrayList<>();
        for(String str : arr){
            str_arr.add(Integer.parseInt(str));
        }
        String answer = "";
        answer += String.valueOf(Collections.min(str_arr) + " " + Collections.max(str_arr));
        return answer;
    }
}