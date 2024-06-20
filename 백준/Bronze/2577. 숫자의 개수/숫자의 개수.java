import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int n = arr[0] * arr[1] * arr[2];

        char[] char_arr = String.valueOf(n).toCharArray(); // str을 toCharArray로 문자 하나씩으로 구성된 배열로 변경
        
        int[] new_arr = new int[10]; // new로 생성하면 초기 값 0으로 초기화

        for(int i = 0; i < char_arr.length; i++){
            new_arr[Character.getNumericValue(char_arr[i])]+=1; // Character의 getNumbericValue 함수를 통해 char을 int로 변환
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < 10; i++){
            bw.write(String.valueOf(new_arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}