import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int gcd = 0;

        int min = Math.min(n,m);
        int max = Math.max(n, m);
        for(int i = 1; i <= min; i++){
            if(max % i == 0 && min % i == 0) gcd = i;
        }

        bw.write(String.valueOf(gcd) + "\n");
        bw.write(String.valueOf((n * m) / gcd));

        bw.flush();
        bw.close();
    }
}