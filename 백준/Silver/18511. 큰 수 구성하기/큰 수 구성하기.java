import java.util.*;
import java.io.*;

public class Main {
    public static int n, k, answer;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < k; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);
        dfs(0);

        System.out.println(answer);
    }

    public static void dfs(int total){
        if(total > n) return;
        if(answer < total) answer = total;

        for(int i = k-1; i >= 0; i--){
            dfs(arr.get(i) + 10 * total);
        }
    }
}