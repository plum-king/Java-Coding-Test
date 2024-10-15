import java.util.*;
import java.io.*;

public class Main{
    public static int[][] graph;
    public static boolean[][] visited;
    public static int n, cnt;
    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        graph = new int[n][n];
        visited = new boolean[n][n];
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            for(int j = 0; j < n; j++){
                graph[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(graph[i][j] == 1 && !visited[i][j]){
                    bfs(i, j);
                    arr.add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(arr);
        System.out.println(arr.size());
        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
    }

    public static void bfs(int a, int b){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a, b});
        visited[a][b] = true;
        cnt++;

        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int x = tmp[0];
            int y = tmp[1];

            for(int i = 0 ; i < 4; i++){
                int next_x = dx[i] + x;
                int next_y = dy[i] + y;

                if(next_x >= 0 && next_y >= 0 && next_x < n && next_y < n){
                    if(!visited[next_x][next_y] && graph[next_x][next_y] == 1){
                        queue.add(new int[]{next_x, next_y});
                        visited[next_x][next_y] = true;
                        cnt++;
                    }
                }
            }
        }
    }
}