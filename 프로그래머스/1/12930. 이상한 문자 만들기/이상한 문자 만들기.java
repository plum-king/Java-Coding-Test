import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");

        String answer = "";
        int idx = 1;
        for(String a : arr){
            if(a.contains(" ")) idx = 1;
            else idx++;
            if(idx % 2 == 0) answer += a.toUpperCase();
            else answer += a.toLowerCase();
        }
        return answer;
    }
}