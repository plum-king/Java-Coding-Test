import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P7287 {
    public static void P7287(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        br = new BufferedReader(new InputStreamReader(System.in));
//        String id = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // Scanner 사용하는 것보다 훨씬 빠르다! (물론 출력도)
        int p = 35;
        bw.write(String.valueOf(p));
        bw.newLine();
        bw.write("kayo");
        bw.flush();
        bw.close();
    }
}
