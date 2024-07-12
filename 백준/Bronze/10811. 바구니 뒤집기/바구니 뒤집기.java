import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken()) - 1;
            int two = Integer.parseInt(st.nextToken()) - 1;
            while(one < two){
                int tmp = arr[one];
                arr[one++] = arr[two];
                arr[two--] = tmp;
            }
        }
        br.close();

        for(int i = 0; i < N; i++){
            bw.write(String.valueOf(arr[i]) + " ");
        }
        bw.close();
    }
}