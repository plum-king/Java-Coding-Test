class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        
        String[] str = letter.split(" ");
        for(String s: str){
            for(int i = 0; i < morse.length; i++){
                if(morse[i].equals(s)){
                    answer += Character.toString(i + 'a');
                }
            }
        }

        return answer;
    }
}