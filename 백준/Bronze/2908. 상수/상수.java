import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int reverse_n = (n%10) * 100 + ((n%100)/10) * 10 + (n/100);
        int m = Integer.parseInt(st.nextToken());
        int reverse_m = (m%10) * 100 + ((m%100)/10) * 10 + (m/100);

        for(int i = 0; i < 3; i++){
            if(n%10 > m%10){
                bw.write(String.valueOf(reverse_n));
                break;
            }
            else if(n%10 < m%10){
                bw.write(String.valueOf(reverse_m));
                break;
            }
            else{
                n /= 10;
                m /= 10;
            }
        }

        bw.flush();
        bw.close();
    }
}