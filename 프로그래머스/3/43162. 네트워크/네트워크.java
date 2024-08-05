class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean [] visited = new boolean[computers.length];
        
        for(int i = 0; i < computers.length; i++){
            visited[i] = false; // false로 모두 초기화
        }
        
        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false){
                answer++;
                dfs(i, visited, computers);
            }
        }
        return answer;
    }
    
    public static void dfs(int node, boolean[] visited, int[][] c){
        visited[node] = true;
        
        for(int i = 0; i < c.length; i++){
            if(visited[i] == false && c[node][i] == 1){
                dfs(i, visited, c);
            }
        }
    }
}