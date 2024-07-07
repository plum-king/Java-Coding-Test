import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int ans = 1;

        for(int i = 1; i <= n; i++){
            ans *= i;
        }

        int un = 1;
        for(int i = 1; i <= (n-k); i++){
            un *= i;
        }

        for(int i = 1; i <= k; i++){
            un *= i;
        }

        bw.write(String.valueOf(ans/un));
        bw.flush();
        bw.close();
    }
}