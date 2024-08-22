import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int[][] graph;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < m; j++){
                graph[i][j] = str.charAt(j) - '0';
            }
        }
        visited[0][0] = true;
        bfs(0, 0);
        bw.write(String.valueOf(graph[n-1][m-1]));
        bw.flush();
        bw.close();
    }

    static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            int now_x = now[0];
            int now_y = now[1];
            for(int i = 0; i < 4; i++){
                int next_x = now_x + dx[i];
                int next_y = now_y + dy[i];
                if(next_x < n && next_y < m && next_x >= 0 && next_y >= 0) {
                    if(graph[next_x][next_y] == 1 && !visited[next_x][next_y]){
                        queue.add(new int[]{next_x, next_y});
                        graph[next_x][next_y] = graph[now_x][now_y] + 1;
                        visited[next_x][next_y] = true;
                    }
                }
            }
        }
    }
}