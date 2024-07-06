import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Double[] arr = new Double[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Double.parseDouble(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());
        double sum = 0;
        for(int i = 0; i < n; i++){
            sum += (arr[i]/arr[0]) * 100;
        }

        bw.write(String.valueOf(sum / n));

        bw.flush();
        bw.close();
    }
}