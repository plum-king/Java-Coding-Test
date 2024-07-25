import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int s = (a*d) + (b*c);
        int p = (b*d);

        int gcd = gcd(s, p);
        s /= gcd;
        p /= gcd;

        bw.write(String.valueOf(s) + " " + String.valueOf(p));
        bw.flush();
        bw.close();
    }

    public static int gcd(int p, int q){
        if(q == 0) return p;
        return gcd(q, p % q);

        // ex. 4, 8 넣으면 gcd(4, 0) -> 4
    }
}