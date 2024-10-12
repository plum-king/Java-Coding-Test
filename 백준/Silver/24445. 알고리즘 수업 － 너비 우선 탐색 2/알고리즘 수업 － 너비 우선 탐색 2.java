import java.util.*;
import java.io.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static int[] visited;
    public static int cnt = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < n+1; i++){
            graph.add(new ArrayList<Integer>());
        }
        visited = new int[n+1];
        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        for(int i = 1; i < n+1; i++){
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        
        bfs(r);
        for(int i = 1; i <= n; i++){
            System.out.println(visited[i]);
        }
    }
    public static void bfs(int r){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(r);
        visited[r] = cnt;
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            
            for(int i : graph.get(tmp)){
                if(visited[i] == 0){
                    cnt++;
                    visited[i] = cnt;
                    queue.add(i);
                }
            }
        }
    }
}