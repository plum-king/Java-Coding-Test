import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());
            int j = 0;
            while(m > 0){
                if(m % 2 != 0){
                    sb.append(j + " ");
//                    bw.write(String.valueOf(j)+" ");
                }
                m /= 2;
                j++;
            }
//            bw.newLine();
            sb.append("\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    }

}