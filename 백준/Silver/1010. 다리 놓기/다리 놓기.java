import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int max = 30;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());


        int[][] arr = new int[max + 1][max + 1];

        for(int i = 1; i <= max; i++){
            arr[i][i] = 1;
            arr[i][0] = 1;
        }

        for (int i = 2; i <= max; i++){
            for (int j = 1; j <= max; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N > M){
                bw.write(String.valueOf(arr[N][M]) +"\n");
            }
            else{
                bw.write(String.valueOf(arr[M][N]) +"\n");
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}