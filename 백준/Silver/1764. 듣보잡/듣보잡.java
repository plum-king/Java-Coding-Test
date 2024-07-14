import java.io.*;
import java.util.*;

public class Main {

    public static int sum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> n_hash = new HashSet<>();


        for(int i = 0; i < n; i++){
            n_hash.add(br.readLine());
        }

        ArrayList<String> n_m = new ArrayList<>();

        for(int i = 0; i < m; i++){
            String m_arr = br.readLine();
            if(n_hash.contains(m_arr)){ // HashSet의 contains()의 시간 복잡도 = O(1)
                n_m.add(m_arr);
            }
        }

//        for(int i = 0; i < m; i++){
//            if(n_arr.contains(m_arr.get(i))){
//                n_m.add(m_arr.get(i)); // ArrayList의 contains()의 시간 복잡도 = O(n)
//            }
//        }

        n_m.sort(Comparator.naturalOrder());

        bw.write(String.valueOf(n_m.size())+"\n");

        for(int i = 0; i < n_m.size(); i++){
            bw.write(n_m.get(i) + "\n");
        }
        bw.flush();
        bw.close();
    }
}