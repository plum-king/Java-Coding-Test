import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        ArrayList<String> parti = new ArrayList<>();
        ArrayList<String> comple = new ArrayList<>();
        
        for(int i = 0; i < participant.length; i++) parti.add(participant[i]);
        for(int i = 0; i < completion.length; i++) comple.add(completion[i]);
        Collections.sort(parti);
        Collections.sort(comple);
        
        String answer = "";
        
        for(int i = 0; i < comple.size(); i++){
            if(!(parti.get(i).contains(comple.get(i)))){
                answer += parti.get(i);
                break;
            }
        }
        if(answer.length() == 0) answer = parti.get(parti.size()-1);
        return answer;
    }
}