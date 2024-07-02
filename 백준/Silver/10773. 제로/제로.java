import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < N; i++){

            int tmp = Integer.parseInt(br.readLine());
            if(tmp == 0){
                deque.pollLast();
            }
            else{
                deque.offerLast(tmp);
            }
        }

        while(deque.size() > 0){
            sum += deque.poll();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}