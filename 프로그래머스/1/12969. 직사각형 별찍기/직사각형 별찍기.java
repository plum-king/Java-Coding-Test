import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                sb.append("*");
            }
                sb.append("\n");
        }
        System.out.println(String.valueOf(sb));
    }
}