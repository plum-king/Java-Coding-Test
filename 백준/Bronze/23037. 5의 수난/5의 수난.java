import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 4; i >= 0; i--){
            sum += Math.pow((int)(t / Math.pow(10, i)),5);
            t %= Math.pow(10, i);
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();
    }
}