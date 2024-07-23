import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static int[] arr;
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int ans = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++){
            int sum = i;
            int tmp = i;
            while(tmp > 0){
                sum += (tmp % 10);
                tmp /= 10;
            }
            if(n == sum) {
                ans = i;
                break;
            }
        }

        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
    }
}