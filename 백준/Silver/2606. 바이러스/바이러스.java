import java.util.*;
import java.io.*;

public class Main{
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static boolean[] visited;
    public static int cnt = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        visited = new boolean[n+1];

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

        dfs(1);
        System.out.println(cnt);
    }
    public static void dfs(int n){
        visited[n] = true;

        for(int i = 0; i < arr.get(n).size(); i++){
            int tmp = arr.get(n).get(i);
            if(!visited[tmp]){
                cnt++;
                dfs(tmp);
            }
        }
    }
}