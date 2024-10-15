import java.util.*;
import java.io.*;

public class Main{
    public static int[] dx = {1, -1, 2};
    public static int[] visited = new int[100001];
    public static int k;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        bfs(n);
        System.out.println(visited[k]);
    }
    public static void bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while(!queue.isEmpty()){
            int x = queue.poll();
            if(x == k){
                return;
            }
            
            for(int i = 0; i < 3; i++){
                int next_x;
                if(i == 2) next_x = x * dx[i];
                else next_x = x + dx[i];
                
                if(next_x < visited.length && next_x >= 0){
                    if(visited[next_x] == 0){
                        queue.add(next_x);
                        visited[next_x] = visited[x] + 1;
                    }
                }
            }
        }
    }
}