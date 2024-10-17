class Solution {
    public static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length];
        for(int i = 0; i < visited.length; i++){
            if(!visited[i]){
                answer++;
                dfs(i, computers);
            }
        }
        return answer;
    }
    
    public static void dfs(int x, int[][] computers){
        visited[x] = true;

        for(int i = 0; i < computers[x].length; i++){
            if(!visited[i] && computers[x][i] == 1){
                dfs(i, computers);
            }
        }
        
    }
}