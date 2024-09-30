import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i : arr) answer.add(i);
        int min = Collections.min(answer);
        for(int i = 0; i < answer.size(); i++){
            if(min == answer.get(i)) answer.remove(i);
        }
        if(answer.size() == 0) answer.add(-1);
        return answer;
    }
}