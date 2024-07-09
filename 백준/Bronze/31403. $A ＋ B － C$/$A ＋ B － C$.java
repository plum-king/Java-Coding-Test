import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());

        int sum = n + m - k;
        String str = String.valueOf(Integer.parseInt(String.valueOf(n) + String.valueOf(m)) - k);


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum)+"\n");
        bw.write(String.valueOf(str));
        bw.flush();
        bw.close();
    }
}