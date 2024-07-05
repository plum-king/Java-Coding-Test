import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[k];

        for(int i = 0; i < k; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int n = 0;
        for(int i = 0; i < k; i++){
            if(arr[i] == 1){
                continue;
            }
            int sum = 0;

            for(int j = 1; j <= arr[i]; j++){
                if(arr[i] % j == 0) {
                    sum++;
                }
            }
            if(sum == 2){
                n++;
            }
        }

        bw.write(String.valueOf(n));

        bw.flush();
        bw.close();
    }
}