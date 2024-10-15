import java.util.*;
import java.io.*;

public class Main{
    public static int[][] arr;
    public static int[][] visited;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static int n, m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new int[n][m];
        
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < m; j++){
                arr[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        
        bfs(0, 0);
        System.out.println(visited[n-1][m-1]);
    }
    public static void bfs(int a, int b){
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
                
                if(next_x >= 0 && next_y >= 0 && next_x < n && next_y < m){
                    if(visited[next_x][next_y] == 0 && arr[next_x][next_y] == 1){
                        queue.add(new int[]{next_x, next_y});
                        visited[next_x][next_y] = visited[x][y] + 1;
                    }
                }
            }
        }
    }
}