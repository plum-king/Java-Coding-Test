import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(n % (i+1) == 0){
                arr.add(i+1);
            }
        }

        if(arr.size() >= m){
            bw.write(String.valueOf(arr.get(m-1)));
        }
        else{
            bw.write("0");
        }
        bw.flush();
        bw.close();
    }
}