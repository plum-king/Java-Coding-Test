class Solution {
    public String solution(int n) {
        String[] str = {"수", "박"};
        String answer = "";
        for(int i = 0; i < n; i ++){
            answer += str[i%2];
        }
        return answer;
    }
}