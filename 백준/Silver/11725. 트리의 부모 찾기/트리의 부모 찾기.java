import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static int[] parent;
    static ArrayList<Integer> array[]; //ArrayList 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        array = new ArrayList[t+1]; // ArrayList 배열 개수
        for(int i = 0; i < t+1; i++){
            array[i] = new ArrayList<>(); // ArrayList 배열 내 ArrayList 저장
        }
        visited = new boolean[t+1];
        parent = new int[t+1];

        for(int i = 0; i < t-1; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            array[n].add(m);
            array[m].add(n);
        }

        dfs(1);
        for(int i = 2; i < t+1; i++){
            bw.write(String.valueOf(parent[i])+ "\n");
        }
        bw.flush();
        bw.close();
    }

    static void dfs(int x){
        visited[x] = true;
        for(int i: array[x]){
            if(!visited[i]){
                parent[i] = x;
                dfs(i);
            }
        }
    }
}