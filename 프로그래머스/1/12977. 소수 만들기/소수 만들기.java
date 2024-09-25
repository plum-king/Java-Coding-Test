import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length - 2; i++){
            for(int j = i+1; j < nums.length - 1; j++){
                for(int k = j+1; k < nums.length; k++){
                    int tmp = nums[i] + nums[j] + nums[k];
                    int cnt = 0;
                    for(int l = 1; l <= tmp; l++){
                        if(tmp % l == 0){
                            cnt++;
                            if(cnt > 2) break;
                        }
                    }
                    if(cnt == 2) answer++;
                    cnt = 0;
                }
            }
        }
        return answer;
    }
}