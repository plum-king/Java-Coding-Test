import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static int[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // 순서 저장을 위한 변수
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        visited = new int[n+1];

        // 그래프 초기화
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Integer>());
        }

        // 그래프에 값 넣기
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 오름차순 정렬하기 (한 정점에 대해서)
        for(int i = 1; i <= n; i++){
            Collections.sort(graph.get(i)); // 정점은 1부터 시작하니까..
        }

        // dfs
        count++;
        dfs(r);

        for(int i = 1; i < visited.length; i++){
            bw.write(String.valueOf(visited[i] + "\n" ));
        }
        bw.flush();
        bw.close();
    }
    public static void dfs(int r){
        visited[r] = count;
        for(int i = 0; i < graph.get(r).size(); i++){
            int v = graph.get(r).get(i);
            if(visited[v] == 0){
                count++;
                dfs(v);
            }
        }
    }

}