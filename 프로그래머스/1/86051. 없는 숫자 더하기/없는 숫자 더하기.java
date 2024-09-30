import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i : numbers) sum += i;
        int answer = 45 - sum;
        return answer;
    }
}