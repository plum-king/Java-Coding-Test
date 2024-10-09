import java.util.*;
import java.io.*;

class Main{
    public static int visited[] = new int[100001];
    public static int[] da = {1, -1, 2};
    public static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        if(n == k) System.out.println(0);
        else System.out.println(bfs(n, k));
    }
    
    public static int bfs(int n, int k){
        visited[n] = 1;
        queue.add(n);
        
        while(!queue.isEmpty()){
            int a = queue.poll();
            for(int i = 0; i < 3; i++){
                int next_a;
                if(i == 2) next_a = a * da[i];
                else next_a = a + da[i];
                
                if(next_a == k){
                    return visited[a];
                }
                
                if(next_a >= 0 && next_a < visited.length && visited[next_a] == 0){
                    queue.add(next_a);
                    visited[next_a] = visited[a] + 1;
                }
            }
        }
        return -1;
    }
}