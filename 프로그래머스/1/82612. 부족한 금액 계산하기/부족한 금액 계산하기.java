class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long cnt = 0;
        for(int i = 0; i < count; i++){
            cnt += price * (i+1);
        }
        
        if(cnt - money > 0) answer = cnt - money;
        
        return answer;
    }
}