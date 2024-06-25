import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] arr = new Integer[8];
        for(int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        String str = "mixed";
        Integer[] new_arr = new Integer[8];
        for(int i = 0; i < 8; i++){
            new_arr[i] = arr[i];
        }
        Arrays.sort(new_arr);

        if(Arrays.equals(arr, new_arr)){
            str = "ascending";
        }
        else{
            Integer[] new_arr2 = new Integer[8];
            for(int i = 0; i < 8; i++){
                new_arr2[i] = arr[i];
            }            Arrays.sort(new_arr2, (a,b) ->
                    b-a
            );
            if(Arrays.equals(arr, new_arr2)){
                str = "descending";
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(str);
        bw.flush();
    }
}