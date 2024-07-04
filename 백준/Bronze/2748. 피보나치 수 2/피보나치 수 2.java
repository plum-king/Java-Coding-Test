import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Long N = Long.parseLong(br.readLine());
        Long[] arr = new Long[(int) (N+1)];
        arr[0] = 0L;
        arr[1] = 1L;

        for(int i = 2; i < N+1; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        bw.write(String.valueOf(arr[Math.toIntExact(N)]));

        br.close();
        bw.flush();
        bw.close();
    }
}