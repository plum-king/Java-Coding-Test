class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int cnt = s.length();
        if(cnt != 4 && cnt != 6){
            answer = false;
        }
        
        if(answer){
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'z'){
                    answer = false;
                    break;
                }
            }
        }
        
        return answer;
    }
}