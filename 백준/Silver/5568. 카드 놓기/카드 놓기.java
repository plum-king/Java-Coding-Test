import java.util.*;
import java.io.*;

public class Main{
    public static boolean[] visited;
    public static int n, k, cnt;
    public static ArrayList<String> arrayList = new ArrayList<>();
    public static String[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }
        
        visited = new boolean[n];
        dfs(0, "");
        System.out.println(arrayList.size());
        
    }
    public static void dfs(int depth, String a){
        if(depth == k){
            if(!arrayList.contains(a)){
                arrayList.add(a);
            }
            return;
        }
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(depth+1, a+arr[i]);
                visited[i] = false;
            }
        }
    }
}