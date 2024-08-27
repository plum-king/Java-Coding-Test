import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer> count = new ArrayList<>();
    static int n, m;
    static ArrayList<Integer>[] graph;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++){
            graph[i] = new ArrayList<>();
        }
        visited = new boolean[n+1];

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[b].add(a);
        }
        for(int i = 0; i < n; i++){
            dfs(i+1);
            count.add(cnt);
            visited = new boolean[n+1];
            cnt = 0;
        }
        int max_num = Collections.max(count); // ArrayList 중 가장 큰 수
        for(int i = 0; i < n; i++){
            if(max_num == count.get(i)){
                bw.write(String.valueOf((i+1))+ " ");
            }
        }
        bw.flush();
        bw.close();
    }
    public static void dfs(int x){
        visited[x] = true;
        for(int i: graph[x]){
            if(!visited[i]){
                cnt++;
                dfs(i);
            }
        }
    }
}