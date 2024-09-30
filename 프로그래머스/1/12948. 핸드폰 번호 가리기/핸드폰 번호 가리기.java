class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int num_length = phone_number.length();
        // 0 ~ num_length-5까지 *로 대체
        for(int i = 0; i < num_length - 4; i++)
            answer += "*";
        answer += phone_number.substring(num_length - 4, num_length);
        return answer;
    }
}