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
        
        int max_ga = Collections.max(ga);
        int max_se = Collections.max(se);
        int idx_ga = ga.indexOf(max_ga);
        int idx_se = se.indexOf(max_se);
        
        if(max_ga >= max_se){
            answer = max_ga;
            for(int i = 0; i < sizes.length; i++){
                if(se.get(i) > ga.get(i)) se.set(i, ga.get(i));
            }
            answer *= Collections.max(se);
        } 
        else {
            answer = max_se;
            for(int i = 0; i < sizes.length; i++){
                if(ga.get(i) > se.get(i)) ga.set(i, se.get(i));
            }
            answer *= Collections.max(ga);
        }
        
        return answer;
    }
}