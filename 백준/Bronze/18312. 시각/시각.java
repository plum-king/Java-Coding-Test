import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[] = new int[2];
        for(int i = 0; i < 2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        for(int i = 0; i <= arr[0]; i++) {
            for(int j = 0; j <= 59; j++) {
                for(int k = 0; k <= 59; k++) {
                    int a = i / 10;
                    int b = i % 10;
                    int c = j / 10;
                    int d = j % 10;
                    int e = k / 10;
                    int f = k % 10;
                    if(a == arr[1] || b == arr[1] || c == arr[1] || d == arr[1] || e == arr[1] || f == arr[1]) {
                        count++;
                    }
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}