import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        Arrays.sort(works);
        //낮은 숫자가 우선 순위인 int 형 우선순위 큐 선언
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : works){
            pq.offer(num);
        }
        while(n!=0){
            int num = pq.poll();
            if(num==0){
                return 0;
            }
            num--;
            pq.offer(num);
            n--;
        }
        while(!pq.isEmpty()){
            int num = pq.poll();
            answer += num*num;
        }
        return answer;
    }
}