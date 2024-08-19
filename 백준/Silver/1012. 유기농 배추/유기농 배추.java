import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0}; // 위, 아래, 왼, 오
    static int[][] map;
    static boolean[][] visit;
    static int n, m, k, count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 0; i < t; i++){
            count = 0;
            st = new StringTokenizer(br.readLine());
            m = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());

            map = new int[m][n];
            visit = new boolean[m][n];

            for(int j = 0; j < k; j++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                map[a][b] = 1;
            }

            for(int j = 0; j < m; j++){
                for(int l = 0; l < n; l++){
                    if(map[j][l] == 1 && !visit[j][l]){
                        dfs(j, l);
                        count++; // 조건에 맞아서 내부로 들어오면 count를 증가하고 해당하는 값과 인접한 곳에 대해서는 dfs 함수를 통해 visit 배열에 값을 넣는다.
                    }
                }
            }
            bw.write(String.valueOf(count));
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    public static void dfs(int a, int b){
        visit[a][b] = true;
        for(int i = 0; i < 4; i++){
            int next_a = a + dx[i];
            int next_b = b + dy[i];
            if(next_b < n && next_a < m && next_b >= 0 && next_a >= 0){
                if(map[next_a][next_b] == 1 && !visit[next_a][next_b]){
                    dfs(next_a, next_b);
                }
            }
        }
    }
}