import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++){
            arr[i] = -1;
        }

        for(int i = 0; i < str.length(); i++){
            if(arr[(int) str.charAt(i) - (int) 'a'] != -1){
                continue;
            }
            arr[(int) str.charAt(i) - (int) 'a'] = i;
        }

        for(int i = 0; i < arr.length; i++){
            bw.write(String.valueOf(arr[i]+ " "));
        }

        bw.flush();
        bw.close();
    }
}