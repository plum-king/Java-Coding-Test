import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] answers) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        ArrayList<Integer> correct = new ArrayList<>(Arrays.asList(0, 0, 0));
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == num1[i%5]) correct.set(0, correct.get(0)+1);
            if(answers[i] == num2[i%8]) correct.set(1, correct.get(1)+1);
            if(answers[i] == num3[i%10]) correct.set(2, correct.get(2)+1);
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        int max = Collections.max(correct);
        for(int i = 0; i < 3; i++){
            if(correct.get(i) == max){
                answer.add(i+1);
            }
        }
        
        Collections.sort(answer);
        return answer;
    }
}