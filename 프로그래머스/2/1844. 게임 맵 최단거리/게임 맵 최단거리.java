import java.util.*;

class Solution {
    public static int[][] visited;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public int solution(int[][] maps) {
        visited = new int[maps.length][maps[0].length];
        bfs(0, 0, maps);
        int answer = visited[maps.length-1][maps[0].length-1];
        if(answer == 0) answer = -1;
        return answer;
    }
    public static void bfs(int a, int b, int[][] maps){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, b});
        visited[a][b] = 1;
        
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            
            for(int i = 0; i < 4; i++){
                int next_x = x + dx[i];
                int next_y = y + dy[i];
                
                if(next_x >= 0 && next_y >= 0 && next_x < maps.length && next_y < maps[0].length){
                    if(visited[next_x][next_y] == 0 && maps[next_x][next_y] == 1){
                        visited[next_x][next_y] = visited[x][y] + 1;
                        queue.add(new int[]{next_x, next_y});
                    }
                }
            }
        }
        
    }
}