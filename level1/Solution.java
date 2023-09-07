// 1. goal 인덱스를 본다.
// 2. card1 인덱스와 card2 인덱스를 1개씩 본다.
// 3-1. 만약에 goal 인덱스의 값이 card1 인덱스의 값, card2 인덱스의 값이 동일하다면 일치한 인덱스를 1 증가, goal 인덱스 증가
// 3-2. 만약에 동일한 값이 없다면 "No"
// 4. 1로 돌아가서 다시 진행한다.
// 5. 모든 goal을 다 돌아서 나오면 "Yes"
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int card1_index = 0;
        int card2_index = 0;
        for(int goal_index = 0; goal_index < goal.length; goal_index++){
            if((card1_index < cards1.length) && (goal[goal_index].equals(cards1[card1_index]))){
                card1_index++;
                continue;
            }else if ((card2_index < cards2.length) && (goal[goal_index].equals(cards2[card2_index]))){
                card2_index++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}