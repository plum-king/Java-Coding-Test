class Solution {
    public int solution(int left, int right) {
        int[] arr = new int[right-left+1];
        int answer = 0;
        for(int i = left; i <= right; i++){
            int cnt = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) cnt++;
            }
            arr[i-left] = cnt;
            cnt = 0;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                answer += (i + left);
            }
            else{
                answer -= (i + left);
            }
        }
        
        return answer;
    }
}