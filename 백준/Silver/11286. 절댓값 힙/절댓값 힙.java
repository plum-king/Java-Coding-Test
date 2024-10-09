import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pr = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
                if(Math.abs(a) == Math.abs(b)) return a - b;
                return Math.abs(a) - Math.abs(b);
            }
        });
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());
            if(x != 0) pr.add(x);
            else{
                if(pr.isEmpty()) sb.append(0);
                else sb.append(pr.poll());
                sb.append("\n");
            }
        }
        System.out.println(String.valueOf(sb));
    }
}