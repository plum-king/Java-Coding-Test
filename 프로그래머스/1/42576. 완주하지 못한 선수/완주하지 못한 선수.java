import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String pla : participant){
            map.put(pla, map.getOrDefault(pla, 0)+1);
        }
        for(String pla : completion){
            map.put(pla, map.get(pla) - 1);
        }
        
        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if(entry.getValue() != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}