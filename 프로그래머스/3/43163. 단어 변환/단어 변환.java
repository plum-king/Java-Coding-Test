import java.util.*;

class Solution {
    public static boolean[] visited;
    public static int answer = 0;
    public int solution(String begin, String target, String[] words) {
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            arr.add(words[i]);
        }
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }
    
    public static void dfs(String begin, String target, String[] words, int cnt){
        if(begin.equals(target)){
            answer = cnt;
            return;
        }
        
        for(int i = 0; i < words.length; i++){
            if(visited[i]) continue;
            
            int check=0;
            for(int j = 0; j < words[i].length(); j++){
                if(begin.charAt(j) == words[i].charAt(j)){
                    check++;
                }
                if(check == begin.length()-1){
                    visited[i] = true;
                    dfs(words[i], target, words, cnt+1);
                    visited[i] = false;
                }
            }
        }
    }
}