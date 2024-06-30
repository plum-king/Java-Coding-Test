import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static int sum1 = 0;
    public static int sum2 = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int r1 = fibo(n);
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = arr[2] = 1;
        for(int i = 3; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            sum2+=1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum1 + " " + sum2);
        bw.flush();
        bw.close();
    }

    public static int fibo(int n){
        if(n == 1 || n == 2){
            sum1+=1;
            return 1;
        }
        else{
            return fibo(n-1) + fibo(n-2);
        }
    }
}