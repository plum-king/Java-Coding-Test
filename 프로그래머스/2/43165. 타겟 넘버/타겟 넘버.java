class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, target, 0);
        return answer;
    }
    
    public void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){ // 깊이와 numbers의 길이가 같아지면 탐색 끝
            if(target == sum) answer++; // 탐색 끝난 뒤의 합이 target과 동일하면 정답 개수++
        }
        else{ // 아직 깊이와 numbers의 길이가 같지 않다면 
            dfs(numbers, depth+1, target, sum + numbers[depth]);
            dfs(numbers, depth+1, target, sum - numbers[depth]);
        }
    }
}
