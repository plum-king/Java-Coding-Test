import java.util.*;
import java.io.*;

public class Main{
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static int[] visited;
    public static int cnt = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        visited = new int[n+1];
        
        for(int i = 0; i < n+1; i++){
            arr.add(new ArrayList<>());
        }
        
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
        
        for(int i = 1; i < n+1; i++){
            System.out.println(visited[i]);
        }
    }
    
    public static void dfs(int r){
        visited[r] = cnt;
        
        for(int i = 0; i < arr.get(r).size(); i++){
            int tmp = arr.get(r).get(i);
            if(visited[tmp] == 0){
                cnt++;
                dfs(tmp);
            }
        }
    }
}