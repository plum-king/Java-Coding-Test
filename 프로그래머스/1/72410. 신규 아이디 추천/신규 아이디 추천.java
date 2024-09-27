import java.util.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String step1 = "";
        String step2 = "";
        // 1단계
        step1 = new_id.toLowerCase();
        // 2단계
        char[] step1_arr = step1.toCharArray();
        
        for(char c : step1_arr){
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.'){
                step2 += String.valueOf(c);
            }
        }
        
        // 3단계
        while (step2.contains("..")) {
            step2 = step2.replace("..", ".");
        }
        
        String step4 = step2;
        
        // 4단계
        if(step4.length() > 0 && step4.charAt(0) == '.'){
            step4 = step4.substring(1, step4.length());
        }
        if(step4.length() > 0 && step4.charAt(step4.length()-1) == '.'){
            step4 = step4.substring(0, step4.length()-1);
        }
        
        // 5단계
        if(step4.length() == 0){
            step4 = "a";
        }
        // 6단계
        if(step4.length() >= 16){
            step4 = step4.substring(0, 15);
        }
        if(step4.charAt(step4.length() - 1) == '.'){
            step4 = step4.substring(0, step4.length() - 1);
        }
        // 7단계
        if(step4.length() <= 2){
            String tmp = String.valueOf(step4.charAt(step4.length()-1));
            while(step4.length() != 3){
                step4 += tmp;
            }
        }
        answer = step4;
        return answer;
    }
}