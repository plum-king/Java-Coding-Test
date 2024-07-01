import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Deque<Integer> deque = new LinkedList<>();
        int[] arr = new int[N];

        for(int i = K; i <= N; i++){
            deque.add(i);
        }

        for(int i = 1; i < K; i++){
            deque.add(i);
        }

        for(int i = 0; i < N; i++){
            arr[i] = deque.remove();
            for(int j = 0; j < K-1; j++){
                deque.add(deque.poll());
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("<");
        for(int i = 0; i < arr.length; i++){
            bw.write(String.valueOf(arr[i]));
            if(!(arr.length - 1 == i))
                bw.write(", ");
        }
        bw.write(">");
        bw.flush();
        bw.close();
    }
}