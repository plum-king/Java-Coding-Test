import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int s = (a*d) + (b*c);
        int p = (b*d);

        int max = 0;
        int min = 0;
        if (s > p) {
            max = s;
            min = p;
        }
        else{
            max = p;
            min = s;
        }
        int i = 2;
        while(i <= min){
            if(max % i == 0 && min % i == 0){
                min /= i;
                max /= i;
                i = 2;
            }
            else{
                i++;
            }
        }
        if (s > p) {
            s = max;
            p = min;
        }
        else{
            p = max;
            s = min;
        }

        bw.write(String.valueOf(s) + " " + String.valueOf(p));

        bw.flush();
        bw.close();
    }
}