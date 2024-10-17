import java.util.*;

class Solution {
    public static boolean[] visited;
    public static ArrayList<String> arr = new ArrayList<>();
    public String[] solution(String[][] tickets) {
        String[] answer = {};
        visited = new boolean[tickets.length];
        dfs(tickets, "ICN", "ICN", 0);
        
        Collections.sort(arr);
        answer = arr.get(0).split(" ");
        return answer;
    }
    
    public static void dfs(String[][] tickets, String route, String nation, int cnt){
        if(cnt == tickets.length){
            arr.add(route);
            return;
        }
        
        for(int i = 0; i < tickets.length; i++){
            if(tickets[i][0].equals(nation) && !visited[i]){
                visited[i] = true;
                dfs(tickets, route + " " + tickets[i][1], tickets[i][1], cnt+1);
                visited[i] = false;
            }
        }
    }
}