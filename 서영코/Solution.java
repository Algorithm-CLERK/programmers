// 숫자는 20개 이하 자연수
// 타겟 숫자 1이상 50이하인 자연수
// 타겟 넘버는 1000이하
// 모든 경우의 수 2^20
// 비트마스킹 활용
// 
class Solution {
    public int solution(int[] numbers, int target) {
        int answer = 0;
        
        // 0 ~ 2^(numbers.length-1)
        for (int i = 0; i < (1 << numbers.length); i++) {
        	int sum = 0;
        	// 0이면(원소 미포함) -, 0 이 아니면(원소 포함) +
        	for (int j = 0; j < numbers.length; j++) {
        		if((i & (1<<j)) != 0) {
        			sum += numbers[j];
        		} else {
        			sum -= numbers[j];
        		}
			}
        	// 타겟 넘버인 경우 answer++
        	if(sum==target) answer++;
		}
        return answer;
    }
}