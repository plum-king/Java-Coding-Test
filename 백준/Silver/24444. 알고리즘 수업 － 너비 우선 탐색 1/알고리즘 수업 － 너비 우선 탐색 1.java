import java.io.*;
import java.util.*;

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

        for(int i = 1; i <= n; i++){
            Collections.sort(graph.get(i));
        }

        // bfs
        count++;
        bfs(r);

        for(int i = 1; i < visited.length; i++){
            bw.write(String.valueOf(visited[i] + "\n" ));
        }
        bw.flush();
        bw.close();
    }
    public static void bfs(int r){
        Queue<Integer> q = new LinkedList<>(); // queue를 linkedlist로 구현
        
        q.add(r);
        visited[r] = count;
        
        while(!q.isEmpty()){
            int a = q.poll();
            
            for(int i = 0; i < graph.get(a).size(); i++){
                int v = graph.get(a).get(i);
                if(visited[v] != 0) continue;
                q.offer(v);
                count++;
                visited[v] = count;
            }
        }
    }

}