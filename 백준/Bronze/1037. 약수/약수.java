import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(arr);

        if(arr.size() % 2 == 0){
            // arr의 길이가 짝수라면 맨 뒤와 맨 앞을 곱하면 해당하는 수
            answer = arr.get(0) * arr.get(arr.size()-1);
        }
        else{
            answer = arr.get(arr.size()/2) * arr.get(arr.size()/2);
        }
        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }

}