import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String str = br.readLine();
            String[] str_arr  = str.split(" ");
            for(String s : str_arr){
                if(s.length() != 1){
                    for(int j = s.length()-1; j >= 0; j--){
                        sb.append(String.valueOf(s.charAt(j)));
                    }
                }
                else{
                    sb.append(s);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(String.valueOf(sb));
    }
}
