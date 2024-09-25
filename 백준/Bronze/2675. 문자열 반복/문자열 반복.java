import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder new_str = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            int l = 0;
            for(int j = 1; j <= str.length() * m; j++){
                new_str.append(str.charAt(l));
                if(j % m == 0){
                    l++;
                }
            }
            new_str.append("\n");
        }
        System.out.println(new_str);
    }
}
