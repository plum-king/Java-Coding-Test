import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];

        //최솟값으로 구해야함 - 게임을 완벽하게 하려면 최솟값
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;
        for(int i = 4; i <= n ; i++){
            dp[i] = Math.min(dp[i-1], dp[i-3])+1;
        }

        if(dp[n] % 2 == 1){
            bw.write("SK");
        }
        else{
            bw.write("CY");
        }
        bw.flush();
        bw.close();
    }
}