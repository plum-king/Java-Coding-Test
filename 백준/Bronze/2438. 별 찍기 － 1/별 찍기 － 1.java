import java.io.*;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for(int j = 1; j <= i; j++) bw.write("*");
            bw.newLine();
            bw.flush();
        }
    }
}
