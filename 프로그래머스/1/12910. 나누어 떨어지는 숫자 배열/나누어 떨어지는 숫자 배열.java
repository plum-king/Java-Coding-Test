import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i : arr){
            if(i % divisor == 0) answer.add(i);
        }
        
        Collections.sort(answer);
        
        if(answer.size() == 0) answer.add(-1);
        
        return answer;
    }
}