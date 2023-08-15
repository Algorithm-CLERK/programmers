import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;

        char[] sC = s.toCharArray();

        // 투 포인터
        for (int i = 0; i < sC.length; i++) {
            for (int j = sC.length - 1; j >= i; j--) {
                // i ~ j까지 길이
                // 원본 char 배열
                char[] c1 = new char[j - i + 1];
                for (int k = i; k <= j; k++) {
                    c1[k - i] = sC[k];
                }

                // 역순 char 배열
                char[] c2 = new char[j - i + 1];
                for (int k = i; k <= j; k++) {
                    c2[k - i] = sC[j + i - k];
                }
                if (String.valueOf(c1).equals(String.valueOf(c2))) {
                    answer = Math.max(answer, c1.length);
                }
            }
        }

        return answer;
    }
}