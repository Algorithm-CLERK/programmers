import java.lang.*;
// land에 각 행 마다 숫자를 선택하면서 내려가야한다.
// 조건: 연속해서 같은 열을 선택할 수 없다.
// 열의 개수 : 4개
// 모든 경우의 수를 고려하게 된다면 3^100000경우가 발생 DP로 최적화 가능
class Solution {
    int solution(int[][] land) {
        for(int i=1; i<land.length; i++){
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][1], land[i - 1][0]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][0]);
        }
        return Math.max(Math.max(Math.max(land[land.length-1][0],land[land.length-1][1]),land[land.length-1][2]),land[land.length-1][3]);
    }
}