import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;

        ArrayList<Long> arr = new ArrayList<>();
        
        while(n > 0){
            arr.add(n%10);
            n/=10;
        }
                        
        Collections.sort(arr);
        Collections.reverse(arr);
        
        System.out.println(arr);
                
        for(int i = arr.size() - 1; i >= 0; i--){
            answer += arr.get(arr.size()-1 - i) * Math.pow((double)10, i);
        }
        
        return answer;
    }
}