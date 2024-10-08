class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i = 1; i < arr.length; i++){
            answer = (answer*arr[i]) / gcd(answer, arr[i]);
        }
        return answer;
    }
    public static int gcd(int n, int m){
        int min = Math.min(n, m);
        int res = 0;
        for(int i = 1; i <= min; i++){
            if(n%i == 0 && m%i ==0) res = i;
        }
        return res;
    }
}