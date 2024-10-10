import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayList<Integer> cnt = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            cnt.add(0);
        }
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++){
            if(one[i%5] == answers[i]) cnt.set(0, cnt.get(0)+1);
            if(two[i%8] == answers[i]) cnt.set(1, cnt.get(1)+1);
            if(three[i%10] == answers[i]) cnt.set(2, cnt.get(2)+1);
        }
        int max = Collections.max(cnt);

        for(int i = 0; i < cnt.size(); i++){
            if(max == cnt.get(i)) answer.add(i+1);
        }
        
        int[] an = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            an[i] = answer.get(i);
        }
        return an;
    }
}