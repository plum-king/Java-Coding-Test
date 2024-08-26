import java.io.*;
import java.util.*;

public class Main {
    static int[] visited = new int[100001];
    static int n;
    static int k;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        
        if (n == k) {
            bw.write(String.valueOf(0));
        }
        else{
            // bw.write(String.valueOf(bfs(n)));
            bfs(n);
        }
        bw.flush();
        br.close();
        bw.close();
    }

    static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visited[x] = 1;
        
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            
            for (int i = 0; i < 3; i++) {
                int next;
                
                if (i == 0) {
                    next = tmp + 1;
                } else if (i == 1) {
                    next = tmp - 1;
                } else {
                    next = tmp * 2;
                }
                
                if (next == k) {
                    System.out.println(visited[tmp]);
                    return;
                    // return visited[tmp];
                }

                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    queue.add(next);
                    visited[next] = visited[tmp] + 1;
                }
            }
        }
    }
}