import java.util.*;

class Solution {
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int[][] visited;
    public int solution(int[][] maps) {
        
        visited = new int[maps.length][maps[0].length];
        bfs(maps, 0, 0);
        int answer = visited[maps.length-1][maps[0].length-1];
        if(answer == 0) answer = -1;
        return answer;
    }
    
    public static void bfs(int[][] maps, int a, int b){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, b});
        visited[a][b] = 1;
        
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            
            for(int i = 0; i < 4; i++){
                int new_x = dx[i] + x;
                int new_y = dy[i] + y;
                
                if(new_x < 0 || new_y < 0 || new_x >= maps.length || new_y >= maps[0].length){
                    continue;
                }
                if(visited[new_x][new_y] == 0 && maps[new_x][new_y] == 1){
                    queue.add(new int[]{new_x, new_y});
                    visited[new_x][new_y] = visited[x][y] + 1;
                }   
            }
        }
        
    }
}