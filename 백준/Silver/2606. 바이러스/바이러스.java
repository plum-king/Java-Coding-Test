import java.io.*;
import java.util.*;

public class Main {

    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        visited = new boolean[n+1];

        for(int i = 0; i <= n; i ++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < m; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 1; i <= n; i++) Collections.sort(graph.get(i));

        dfs(1);
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    public static void dfs(int r){
        visited[r] = true;

        for(int i = 0; i < graph.get(r).size(); i++){
            int v = graph.get(r).get(i);
            if(!visited[v]){
                visited[v] = true;
                count++;
                dfs(v);
            }
        }
    }
}