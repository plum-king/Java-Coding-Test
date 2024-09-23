import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());
            int j = 0;
            while(m > 0){
                if(m % 2 != 0){
                    bw.write(String.valueOf(j)+" ");
                }
                m /= 2;
                j++;
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

}