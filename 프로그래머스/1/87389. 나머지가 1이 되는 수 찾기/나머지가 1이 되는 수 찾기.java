class Solution {
    public int solution(int n) {
        int answer = n;
        for(int i = 2; i < n; i++){
            if(answer % i == 1){
                answer = Math.min(answer, i);
            }
        }
        return answer;
    }
}