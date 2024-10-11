import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if((c >= 'A') && (c <= 'C')) cnt += 3;
            else if((c >= 'D') && (c <= 'F')) cnt+=4;
            else if((c >= 'G') && (c <= 'I')) cnt+=5;
            else if((c >= 'J') && (c <= 'L')) cnt+=6;
            else if((c >= 'M') && (c <= 'O')) cnt+=7;
            else if((c >= 'P') && (c <= 'S')) cnt+=8;
            else if((c >= 'T') && (c <= 'V')) cnt+=9;
            else if((c >= 'W') && (c <= 'Z')) cnt+=10;
        }
        
        System.out.println(cnt);
    }
}