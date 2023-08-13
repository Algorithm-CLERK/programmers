import java.util.*;

class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0; // 정답
        int row = board.length; // 가로
        int col = board[0].length; // 세로
        int[][] map = new int[row+1][col+1]; // 가로+1, 세로+1 이차원 배열 생성
        
        for(int i=1; i<row+1; i++){
            for(int j=1; j<col+1; j++){
                map[i][j] = board[i-1][j-1];
            }
        }
        
        for(int i=0; i<row+1; i++){
            for(int j=0; j<col+1; j++){
                if(map[i][j]==0) continue;
                map[i][j] = Math.min(Math.min(map[i-1][j-1],map[i-1][j]),map[i][j-1]) + 1;
                answer = Math.max(answer,map[i][j]);
            }
        }
        
        return answer*answer;
    }
}