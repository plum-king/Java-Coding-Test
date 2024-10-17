class Solution {
    public static int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return answer;
    }
    
    public static void dfs(int[] numbers, int depth, int x, int target){
        if(depth == numbers.length){
            if(target == x){
                answer++;
            }
            return;
        }

        dfs(numbers, depth+1, x+numbers[depth], target);
        dfs(numbers, depth+1, x-numbers[depth], target);
    }
}