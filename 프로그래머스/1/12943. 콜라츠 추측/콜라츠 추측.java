class Solution {
    public int solution(long num) {
        int answer = 0;
        while(num != 1){
            if(answer == 500){
                answer = -1;
                break;
            }
            
            if(num % 2 == 0) num/=2;
            else{
                num *= 3;
                num += 1;
            }
            answer++;
        }
        return answer;
    }
}