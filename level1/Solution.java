import java.lang.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length()%2==0){ // 짝수인 경우
            answer += String.valueOf(s.charAt(s.length()/2 - 1));
            answer += String.valueOf(s.charAt(s.length()/2));
        }else{ // 홀수인 경우
            answer = String.valueOf(s.charAt(s.length()/2));
        }
        return answer;
    }
}