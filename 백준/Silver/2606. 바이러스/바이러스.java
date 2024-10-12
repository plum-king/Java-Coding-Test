import java.util.*;
import java.io.*;

public class Main{
    public static int[][] graph;
    public static boolean[] visited;
    public static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        StringTokenizer st;
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        cnt = 0;
        dfs(1);
        System.out.println(cnt);
    }
    public static void dfs(int v){
        visited[v] = true;
        for(int i = 0; i < graph[v].length; i++){
            if(!visited[i] && graph[v][i] == 1){
                cnt++;
                dfs(i);
            }
        }
    }
}