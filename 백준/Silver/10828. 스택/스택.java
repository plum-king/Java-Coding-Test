import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        for(int i = 0; i< N; i++){
            String str = br.readLine();
            String[] str_arr = new String[2];
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            if(str.contains(" ")){
                str_arr = str.split(" ");
                str = str_arr[0];
            }

            if(str.equals("push")){
                deque.add(Integer.parseInt(str_arr[1]));
            }
            else if(str.equals("top")){
                if(deque.isEmpty()){
                    bw.write("-1");
                }
                else{
                    bw.write(String.valueOf(deque.getLast()));
                }
                bw.newLine();
            }
            else if(str.equals("size")){
                bw.write(String.valueOf(deque.size()));
                bw.newLine();
            }
            else if(str.equals("empty")){
                if(deque.isEmpty()){
                    bw.write("1");
                }
                else{
                    bw.write("0");
                }
                bw.newLine();
            }
            else{
                if(deque.isEmpty()){
                    bw.write("-1");
                }
                else{
                    bw.write(String.valueOf(deque.removeLast()));
                }
                bw.newLine();
            }
            bw.flush();
        }
    }
}