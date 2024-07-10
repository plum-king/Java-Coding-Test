import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int thi = n * ((m%100)%10);
        int fo = n * ((m%100)/10);
        int fiv = n * (m/100);
        int res = n * m;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(thi)+"\n");
        bw.write(String.valueOf(fo)+"\n");
        bw.write(String.valueOf(fiv)+"\n");
        bw.write(String.valueOf(res));
        bw.flush();
        bw.close();
    }
}