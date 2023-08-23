class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int stack = 0; // stack '('
        for(char c : s.toCharArray()){
            if(c == '('){
                stack+=1;
            }else{
                stack-=1;
                if(stack<0){
                    return false;
                }
            }
        }
        if(stack!=0){
            return false; 
        }else{
            return true;
        }
    }
}