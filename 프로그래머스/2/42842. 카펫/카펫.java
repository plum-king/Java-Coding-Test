class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int tmp = brown + yellow;
        for(int i = (int)Math.sqrt(tmp); i >= 1; i--){
            if(tmp % i == 0){
                int ga = i;
                int se = tmp / i;
                if(yellow == (ga-2)*(se-2)){
                    answer[0] = se;
                    answer[1] = ga;
                    break;
                }
            }
        }
        return answer;
    }
}