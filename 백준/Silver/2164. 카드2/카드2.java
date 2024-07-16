import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            deque.offerLast(i+1);
        }

        while(deque.size() > 1){
            deque.removeFirst();
            deque.offerLast(deque.removeFirst());
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(deque.peekFirst()));
        bw.flush();
        bw.close();
    }
}