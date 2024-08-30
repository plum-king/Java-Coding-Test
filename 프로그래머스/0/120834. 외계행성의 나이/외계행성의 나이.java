class Solution {
    public String solution(int age) {
        String answer = "";

        while(age > 0){
            int new_age = age % 10;
            answer += (char)(new_age + (int)'a');
            age /= 10;            
        }
        StringBuffer str = new StringBuffer(answer);
        return str.reverse().toString();
        // return answer;
    }
}