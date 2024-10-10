import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++){
            if(one[i%5] == answers[i]) cnt1++;
            if(two[i%8] == answers[i]) cnt2++;
            if(three[i%10] == answers[i]) cnt3++;
        }
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));

        if(max == cnt1) answer.add(1);
        if(max == cnt2) answer.add(2);
        if(max == cnt3) answer.add(3);
        
        int[] an = new int[answer.size()];
        for(int i = 0; i < answer.size(); i++){
            an[i] = answer.get(i);
        }
        return an;
    }
}