import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            switch (st.nextToken()){
                case "push_back":
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case "push_front":
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        bw.write("-1");
                    } else {
                        bw.write(String.valueOf(deque.peekFirst()));
                    }
                    bw.newLine();
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        bw.write("-1");
                    } else {
                        bw.write(String.valueOf(deque.peekLast()));
                    }
                    bw.newLine();
                    break;
                case "size":
                    bw.write(String.valueOf(deque.size()));
                    bw.newLine();
                    break;
                case "empty":
                    if(deque.isEmpty()){
                        bw.write("1");
                    }
                    else {
                        bw.write("0");
                    }
                    bw.newLine();
                    break;
                case "pop_front":
                    if(deque.isEmpty()){
                        bw.write("-1");
                    }
                    else {
                        bw.write(String.valueOf(deque.pollFirst()));
                    }
                    bw.newLine();
                    break;
                case "pop_back":
                    if(deque.isEmpty()){
                        bw.write("-1");
                    }
                    else {
                        bw.write(String.valueOf(deque.pollLast()));
                    }
                    bw.newLine();
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}