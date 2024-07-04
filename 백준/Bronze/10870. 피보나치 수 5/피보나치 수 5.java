import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        arr[0] = 0;

        for(int i = 1; i < N+1; i++){
            if(i == 1 || i == 2){
                arr[i] = 1;
            }
            else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(arr[N]));
        bw.flush();
        bw.close();
    }
}