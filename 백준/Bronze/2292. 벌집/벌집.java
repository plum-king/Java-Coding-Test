import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int cnt = 1;
        int range = 2;

        if(n == 1){
            bw.write(String.valueOf(cnt));
        }
        else{
            while(range <= n){
                range += (cnt * 6);
                cnt++;
            }
            bw.write(String.valueOf(cnt));
        }

        bw.flush();
        bw.close();
    }
}