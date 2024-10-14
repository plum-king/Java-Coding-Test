import java.util.*;
import java.io.*;

public class Main{
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < n+1; i++){
            arr.add(new ArrayList<>());
        }
        
        visited = new boolean[n+1];
        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        
        for(int i = 1; i < n+1; i++){
            Collections.sort(arr.get(i));
        }
        
        dfs(r);
        visited = new boolean[n+1];
        sb.append("\n");
        bfs(r);
        System.out.println(String.valueOf(sb));
    }
    
    public static void dfs(int v){
        visited[v] = true;
        sb.append(v + " ");
        
        for(int i = 0; i < arr.get(v).size(); i++){
            int tmp = arr.get(v).get(i);
            if(!visited[tmp]){
                dfs(tmp);
            }
        }
    }
    
    public static void bfs(int v){
        visited[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        sb.append(v+ " ");
        
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = 0; i < arr.get(tmp).size(); i++){
                int r = arr.get(tmp).get(i);
                if(!visited[r]){
                    queue.add(r);
                    visited[r] = true;
                    sb.append(r + " ");
                }
            }
        }
    }

}