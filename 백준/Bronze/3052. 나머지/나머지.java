import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for(int i = 0; i < 10; i++){
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }

        int[] new_arr = Arrays.stream(arr).distinct().toArray();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(new_arr.length));
        bw.flush();
    }
}