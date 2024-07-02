import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(bf.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (num == 1) {
                stack.add(Integer.parseInt(st.nextToken()));
            } else if (num == 2) {
                if (!stack.isEmpty()) {
                    bw.write(stack.pop() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            } else if (num == 3) {
                bw.write(stack.size() + "\n");
            } else if (num == 4) {
                if (stack.isEmpty()) {
                    bw.write(1 + "\n");
                } else {
                    bw.write(0 + "\n");
                }
            } else if (num == 5) {
                if (!stack.isEmpty()) {
                    bw.write(stack.peek() + "\n");
                } else {
                    bw.write(-1 + "\n");
                }
            }
        }
        bw.flush();
    }
}