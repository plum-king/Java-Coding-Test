import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {      
        
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        int answer = n-lost.length; // 도난 당하지 않은 학생 수
        // 도난 당해서 빌려줄 수 없는 경우
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] == reserve[j]){
                    answer++; // 여분 옷을 가지고 있지만 도난 당한 학생 더하기
                    lost[i] = -1; // 이미 이 숫자에 대해서는 탐색 끝났으니 -1로 두 번째 for문 탈출
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for(int i = 0; i < lost.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]){ // 만약 lost의 하나 뒤의 값이나 앞의 값이 reserve 내에 있는 값이라면
                    answer++; // 빌려줄 수 있고
                    reserve[j] = -1; // 해당 reserve의 값은 체육복을 빌려줬으니 더 빌려줄 수 없어서 탐색 종료
                    break; // 두 번째 for문 탈출
                }
            }
        }
        
//         // 체육복 있으면 1, 없으면 0, 여벌 있으면 2 or 1
//         for(int i = 1; i < n+1; i++){
//             exist[i] = 1;
//         }
//         for(int i : lost){
//             exist[i]--;
//         }
//         for(int i : reserve){
//             exist[i]++;
//         }
        
//         // exist에서 0인 애들의 앞 뒤 중 하나가 2면 걔네를 1로 만들면서 끝
//         for(int i = 1; i <n+1; i++){
//             if(exist[i] == 0 && i < n){
//                 if(exist[i-1] == 2){
//                     exist[i-1]--;
//                     exist[i]++;
//                 }
//                 else if(exist[i+1] == 2){
//                     exist[i+1]--;
//                     exist[i]++;
//                 }
//             }
//         }
                
//         for(int i = 1; i < n+1; i++){
//             if(exist[i] > 0) answer++;
//         }
        
        return answer;
    }
}