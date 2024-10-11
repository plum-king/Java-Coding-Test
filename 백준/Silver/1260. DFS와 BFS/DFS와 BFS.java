import java.io.*;
import java.util.*;

public class Main {
    public static int[][] arr;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(v);
        System.out.println();
        visited = new boolean[n+1];
        bfs(v);
    }

    public static void dfs(int n){
        visited[n] = true;
        System.out.print(n+ " ");

        for(int i = 1; i < arr.length; i++){
            if(!visited[i] && arr[n][i] == 1){
                dfs(i);
            }
        }
    }

    public static void bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        visited[n] = true;
        System.out.print(n+ " ");

        while(!queue.isEmpty()){
            int tmp = queue.poll();

            for(int i = 1; i < arr.length; i++){
                if(!visited[i] && arr[tmp][i] == 1){
                    visited[i] = true;
                    queue.add(i);
                    System.out.print(i + " ");
                }
            }
        }
    }
}