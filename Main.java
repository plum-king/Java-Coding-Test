import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int a = Integer.parseInt(br.readLine());
//        br = new BufferedReader(new InputStreamReader(System.in));
//        String id = br.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int p = 35;
        bw.write(String.valueOf(p));
        bw.newLine();
        bw.write("kayo");
        bw.flush();
        bw.close();
    }
}
