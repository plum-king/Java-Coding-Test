import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            String s = st.nextToken();
            String[] s_arr = s.split(""); // 입력 받은 String 값을 "" 기준으로 잘라 배열로 변환
            String str = "";

            for(int j = 0;  j <s_arr.length; j++){
                str += s_arr[j].repeat(r); // String의 repeat 함수를 사용하여 같은 문자 반복
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
    }
}