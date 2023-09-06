def cnt_true(n):
        num = list(bin(n)[2:]).count('1')
        return num
    
def solution(n):
    answer = 0
    n_cnt = cnt_true(n)
    i = n + 1
    while True:
        if n_cnt == cnt_true(i):
            answer = i
            break
        i += 1
    return answer