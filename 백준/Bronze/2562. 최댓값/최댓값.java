import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 여기서 br 한 번만 사용해도 돼
        int[] arr = new int[9];
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        int big = 0;
        int index = 0;
        for(int i = 0; i < 9; i++){
            if(arr[i] > big){
                big = arr[i];
                index = i+1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(big));
        bw.newLine();
        bw.write(String.valueOf(index));
        bw.flush();
        bw.close();
    }
}