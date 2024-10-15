import java.util.*;
import java.io.*;

public class Main{
    public static int[][] arr;
    public static int[][] visited;
    public static int[] dx = {1, 2, 1, 2, -1, -2, -1, -2};
    public static int[] dy = {2, 1, -2, -1, -2, -1, 2, 1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int l = Integer.parseInt(br.readLine());
            //arr = new int[l][l];
            visited = new int[l][l];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start_x = Integer.parseInt(st.nextToken());
            int start_y = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            
            int dest_x = Integer.parseInt(st.nextToken());
            int dest_y = Integer.parseInt(st.nextToken());
            
            bfs(start_x, start_y, dest_x, dest_y);
            
            sb.append(visited[dest_x][dest_y] + "\n");
        }
        System.out.println(String.valueOf(sb));
    }
    
    public static void bfs(int start_x, int start_y, int dest_x, int dest_y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start_x, start_y});
        
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            
            if(x == dest_x && y == dest_y){
                return;
            }
            
            for(int i = 0; i < 8; i++){
                int next_x = x + dx[i];
                int next_y = y + dy[i];
                if(next_x >= 0 && next_y >= 0 && next_x < visited.length && next_y < visited.length){
                    if(visited[next_x][next_y] == 0){
                        queue.add(new int[]{next_x, next_y});
                        visited[next_x][next_y] = visited[x][y] + 1;
                    }
                }
            }
        }
    }
}