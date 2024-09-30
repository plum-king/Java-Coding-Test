import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> queue = new ArrayList<>();
        for(int i = 0; i < priorities.length; i++){
            queue.add(priorities[i]);
        }
        while(location >= 0){
            int max = Collections.max(queue);
            if(queue.get(0) >= max){
                // 우선순위 max면
                queue.remove(0);
                location--;
                answer++;
                if(location < 0) break;
            }
            else{
                int tmp = queue.get(0);
                queue.remove(0);
                queue.add(tmp);
                location--;
                if(location < 0){
                    location = queue.size() -1;
                }
            }
        }
        return answer;
    }
}