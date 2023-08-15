// import java.util.*;

// class Solution {
//     public int solution(String s) {
//         int answer = 0;
//         char[] sC = s.toCharArray();
//         for (int clen = sC.length; clen > 0; clen--) {
//             for (int i = 0; i <= sC.length - clen; i++) {
//                 // 원본 char 배열
//                 char[] c1 = new char[clen];
//                 for (int k = i; k < i + clen; k++) {
//                     c1[k - i] = sC[k];
//                 }
//                 // 역순 char 배열
//                 char[] c2 = new char[clen];
//                 for (int k = i; k < i + clen; k++) {
//                     c2[k - i] = sC[i + clen - 1 - (k - i)];
//                 }
//                 if (String.valueOf(c1).equals(String.valueOf(c2))) {
//                     return clen;
//                 }
//             }
//         }
//         return answer;
//     }
// }
class Solution {
    public int solution(String s) {

        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j + i <= s.length(); j++) {
                if (isPalindrome(s, j, j + i - 1))
                    return i;
            }
        }

        return 0;
    }

    boolean isPalindrome(String value, int start, int end) {
        while (start <= end) {
            if (value.charAt(start++) != value.charAt(end--))
                return false;
        }
        return true;
    }
}