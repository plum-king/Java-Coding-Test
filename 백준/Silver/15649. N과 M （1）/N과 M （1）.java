import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 3,1 들어오면 한 줄에 1개만 출력
        // 4,2 들어오면 한 줄에 2개씩 출력
        arr = new int[m];
        // 정점에 대해 방문했는지 확인하기 위해
        // 3,1 들어오면 3개의 점에 대해 방문여부 체크
        visit = new boolean[n];
        dfs(n, m, 0);

        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

    public static void dfs(int n, int m, int depth){
        if(depth == m){
            for(int val : arr){
                sb.append(val).append(' ');
            }
            sb.append("\n");
            return;
        }
        for(int i = 0; i < n; i++){
            if(!visit[i]){
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(n , m, depth+1);
                visit[i] = false;
            }
        }
    }
}