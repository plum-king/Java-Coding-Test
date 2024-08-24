import java.util.*;

class Solution {
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    
    public int solution(int[][] maps) {
        graph = maps;
        visited = new boolean[maps.length][maps[0].length];
        visited[0][0] = true;
        bfs(0, 0);
        int answer = -1;
        if(graph[maps.length - 1][maps[0].length - 1] != 1){
            answer = graph[maps.length - 1][maps[0].length - 1];
        }
        return answer;
    }
    
    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int now_x = now[0];
            int now_y = now[1];
            visited[now_x][now_y] = true;
            
            for(int i = 0; i < 4; i++){
                int next_x = now_x + dx[i];
                int next_y = now_y + dy[i];
                if(next_x < graph.length && next_y < graph[0].length && next_x >= 0 && next_y >= 0){
                    if(graph[next_x][next_y] == 1 && !visited[next_x][next_y]){
                        queue.add(new int[]{next_x, next_y});
                        visited[next_x][next_y] = true;
                        graph[next_x][next_y] = graph[now_x][now_y] + 1;
                    }
                
                }
            }
        }
    }
}
