def solution(s):
    answer = 0
    for i in range(len(s)):
        for j in range(len(s), i, -1):
            lst = s[i:j]
            if lst == lst[::-1]:
                answer = max(answer, len(lst))
    return answer

