import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean result = true;
        int answer = 0;

        Queue<String> queue = new LinkedList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')' && !queue.isEmpty()){
                queue.poll();
                answer--;
            }
            else {
                queue.add(String.valueOf(s.charAt(i)));
                answer++;
            }
        }
        
        if(answer != 0) result = false;

        return result;
    }
}