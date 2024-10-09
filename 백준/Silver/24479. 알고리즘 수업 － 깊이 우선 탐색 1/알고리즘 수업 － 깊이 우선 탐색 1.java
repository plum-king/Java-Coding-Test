import java.util.*;
import java.io.*;

class Main {
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static int[] visited;
    public static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        visited = new int[n+1];
        
        for(int i = 0; i <= n; i++){
            arr.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            arr.get(u).add(v);
            arr.get(v).add(u);
        }
        for(int i = 1; i <= n; i++){
            Collections.sort(arr.get(i));
        }

        dfs(r);
        for(int i = 1; i < visited.length; i++){
            sb.append(visited[i]+"\n");
        }
        System.out.println(String.valueOf(sb));
    }
    
    public static void dfs(int r){
        visited[r] = cnt;
        
        for(int i = 0; i < arr.get(r).size(); i++){
            int v = arr.get(r).get(i);
            if(visited[v] == 0){
                cnt++;
                dfs(v);
            }
        }
    }
}