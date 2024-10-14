import java.util.*;
import java.io.*;

public class Main{
    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> array = new ArrayList<>();
    public static int cnt = 1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        
        visited = new int[n+1];
        for(int i = 0; i < n+1; i++){
            array.add(new ArrayList<>());
        }
        
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            array.get(a).add(b);
            array.get(b).add(a);
        }
        
        for(int i = 1; i < n+1; i++){
            Collections.sort(array.get(i));
        }
        
        bfs(r);
        
        for(int i = 1; i < n+1; i++){
            System.out.println(visited[i]);
        }
    }
    
    public static void bfs(int r){
        visited[r] = cnt;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(r);
        
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            
            for(int i = 0; i < array.get(tmp).size(); i++){
                int v = array.get(tmp).get(i);
                if(visited[v] == 0){
                    cnt++;
                    visited[v] = cnt;
                    queue.add(v);
                }
            }
        }
    }
}