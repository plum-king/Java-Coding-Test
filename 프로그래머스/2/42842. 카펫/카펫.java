class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int num = (int)Math.sqrt(sum);
        int[] answer = new int[2];
        for(int i = 3; i <= num; i++){
            if(sum % i == 0 && (sum / i) >= 3){
                if((i-2)*((sum/i)-2) == yellow){
                    answer[0] = sum/i;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}