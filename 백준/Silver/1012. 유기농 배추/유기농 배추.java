import java.util.*;
import java.io.*;

public class Main{
    public static int[][] arr;
    public static boolean[][] visited;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static int cnt = 0;
    public static int m, n;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++){
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            arr = new int[m][n];
            visited = new boolean[m][n];
            
            for(int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a][b] = 1;
            }
            for(int j = 0; j < m; j++){
                for(int l = 0; l < n; l++){
                    if(!visited[j][l] && arr[j][l] == 1){
                        bfs(j, l);
                        cnt++;
                    }
                }
            }
            sb.append(cnt+"\n");
            cnt = 0;
        }
        System.out.println(String.valueOf(sb));

    }
    
    public static void bfs(int v1, int v2){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{v1, v2});
        visited[v1][v2] = true;
        
        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];
            
            for(int i = 0; i < 4; i++){
                int next_x = x + dx[i];
                int next_y = y + dy[i];
                
                if(next_x >= 0 && next_y >= 0 && next_x < m && next_y < n){
                    if(!visited[next_x][next_y] && arr[next_x][next_y] == 1){
                        queue.add(new int[]{next_x, next_y});
                        visited[next_x][next_y] = true;
                    }
                }
            }
        }
    }
}