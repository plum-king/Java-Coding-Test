import java.io.*;

public class Main {

//    public static int sum_zero = 0;
//    public static int sum_one = 0;
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        dp[0][0] = 1; // 0일 때 0 호출 횟수 = 1번
        dp[0][1] = 0; // 0일 때 1 호출 횟수 = 0번
        dp[1][0] = 0; // 1일 때 0 호출 횟수 = 0번
        dp[1][1] = 1; // 0일 때 1 호출 횟수 = 1번
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int m = Integer.parseInt(br.readLine());
            fibo(m);

            bw.write(String.valueOf(dp[m][0]) + " " + String.valueOf(dp[m][1])+"\n");
//            bw.write(String.valueOf(sum_zero) + " " + String.valueOf(sum_one)+"\n");
            bw.flush();
//            sum_zero = 0;
//            sum_one = 0;
        }
    }


    public static Integer[] fibo(int n){
        if(dp[n][0] == null || dp[n][1] == null){
            dp[n][0] = fibo(n-1)[0] + fibo(n-2)[0];
            dp[n][1] = fibo(n-1)[1] + fibo(n-2)[1];
        }
        return dp[n];
    }
//    public static int fibo(int n){

//        if(n == 0){
//            sum_zero++;
//            return sum_zero;
//        }
//        else if(n == 1){
//            sum_one++;
//            return sum_one;
//        }
//        else{
//            return fibo(n-1) + fibo(n-2);
//        }
//    }
}