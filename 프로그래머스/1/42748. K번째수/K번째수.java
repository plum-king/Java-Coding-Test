import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();

        for(int[] a : commands){
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = a[0] - 1; i < a[1]; i++){
                tmp.add(array[i]);
            }
            Collections.sort(tmp);
            answer.add(tmp.get(a[2]-1));
        }
        return answer;
    }
}