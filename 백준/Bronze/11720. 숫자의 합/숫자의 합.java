import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] str_arr = str.split("");
        
        int sum = 0;
        for(int i = 0; i < str_arr.length; i++){
            sum += Integer.parseInt(str_arr[i]);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}