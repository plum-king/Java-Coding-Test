import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        ArrayList<Integer> ga = new ArrayList<>();
        ArrayList<Integer> se = new ArrayList<>();
        
        for(int i = 0; i < sizes.length; i++){
            ga.add(sizes[i][0]);
            se.add(sizes[i][1]);
        }
        
        int ga_max = Collections.max(ga);
        int se_max = Collections.max(se);
        int ga_idx = 0;
        int se_idx = 0;
        
        for(int i = 0; i < ga.size(); i++){
            if(ga_max == ga.get(i)){
                ga_idx = i;
            }
            if(se_max == se.get(i)){
                se_idx = i;
            }
        }
        
        if(ga_max >= se_max){
            answer = ga_max;
            for(int i = 0; i < se.size(); i++){
                if(ga.get(i) <= se.get(i)){
                    se.set(i, ga.get(i));
                }
            }
            se_max = Collections.max(se);
            answer *= se_max;
        }
        else{
            answer = se_max;
            for(int i = 0; i < ga.size(); i++){
                if(ga.get(i) >= se.get(i)){
                    ga.set(i, se.get(i));
                }
            }
            ga_max = Collections.max(ga);
            answer *= ga_max;
        }
        
        return answer;
    }
}