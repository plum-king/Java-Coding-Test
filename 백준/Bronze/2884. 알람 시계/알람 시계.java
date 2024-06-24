import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 1. m이 45보다 작은 경우
        if(m < 45){
            h-=1;
            m = (m + 60) - 45;
        }
        else if(m == 45){
            m = 0;
        }
        else{
            m -= 45;
        }

        if(h < 0){
            h = 23;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(h) + " " + String.valueOf(m));
        bw.flush();
    }
}