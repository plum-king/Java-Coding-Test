import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        while(!str.equals("0")){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String[] arr = str.split("");
            int idx = arr.length / 2;

            Boolean chk = true;

            for(int i = 0; i < idx; i++){
                if (str.charAt(i) != str.charAt(str.length() - 1 - i)) chk = false;
            }

            if(chk) bw.write("yes\n");
            else bw.write("no\n");

            bw.flush();
            str = br.readLine();
        }
    }
}