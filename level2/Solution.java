class Solution {
    public int solution(int n) {
        int answer = n;
        int one_num = oneCount(n);
        while(true){
            answer++;
            if(one_num == oneCount(answer)){
                return answer;
            }
        }
    }
    
    public int oneCount(int num){
        int count = 0;
        while(num!=0){
            if(num%2 == 1){
                count++;
            }
            num/=2;
        }
        return count;
    }
}