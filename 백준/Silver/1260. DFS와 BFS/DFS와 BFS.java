import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static int N;
    public static int M;
    public static int V;
    public static boolean[] visited;
    public static int[][] graph;
    public static StringBuilder sb = new StringBuilder();
    public static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        graph = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = graph[y][x] = 1;
        }

        dfs(V);
        Arrays.fill(visited, false);
        sb.append("\n");
        bfs(V);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static void dfs(int n){
       visited[n] = true;
       sb.append(n).append(" ");
       for(int i = 1; i <= N; i++){
            if(graph[n][i] == 1 && !visited[i]){
                dfs(i);
            }
       }
    }

    public static void bfs(int n){
        queue.add(n);
        visited[n] = true;
        sb.append(n).append(" ");
        while(!queue.isEmpty()){
            int idx = queue.poll();
            for(int i = 1; i <= N; i++){
                if(graph[idx][i] == 1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}