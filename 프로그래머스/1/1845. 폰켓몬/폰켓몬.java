import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        int answer = 0;
        Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<Integer, Integer> entry = iter.next();
            if(entry.getValue() >= 1) answer++;
            if(answer == nums.length/2) break;
        }
        return answer;
    }
}