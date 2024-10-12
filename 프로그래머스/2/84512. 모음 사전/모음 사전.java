import java.util.*;

class Solution {
    public static ArrayList<String> list;
    public static String[] words = {"A", "E", "I", "O", "U"};
    public int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();
        makeWord("", 0);
        int size = list.size();
        for(int i = 0; i < size; i++){
            if(list.get(i).equals(word)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void makeWord(String str, int len){
        list.add(str);
        if(len == 5) return;
        for(int i = 0; i < 5; i++){
            makeWord(str+words[i], len+1);
        }
    }
}