import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int[][] graph;
    static ArrayList<Integer> answer = new ArrayList<>();
    static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        graph = new int[t][t];
        visited = new boolean[t][t];

        for(int i = 0; i < t; i++){
            String str = br.readLine();
            for(int j = 0; j < t; j++){
                graph[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }

        for(int i = 0; i < t; i++){
            for(int j = 0; j < t; j++){
                if(graph[i][j] == 1 && !visited[i][j]){
                    dfs(i, j);
                    answer.add(cnt);
                    cnt = 1;
                }
            }
        }

        Collections.sort(answer);

        bw.write(String.valueOf(answer.size()));
        bw.newLine();
        for(int i = 0; i < answer.size(); i++){
            bw.write(String.valueOf(answer.get(i))+ "\n");
        }
        bw.flush();

        bw.close();
    }

    static void dfs(int x, int y){
        visited[x][y] = true;
        int next_x, next_y;
        for(int i = 0; i < 4; i++){
            next_x = x + dx[i];
            next_y = y + dy[i];

            if(next_x < graph.length && next_y < graph.length && next_y >= 0 && next_x >= 0){
                if(graph[next_x][next_y] == 1 && !visited[next_x][next_y]){
                    cnt++;
                    dfs(next_x, next_y);
                }
            }
        }
    }

}