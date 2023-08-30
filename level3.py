### 아직 푸는 중
def solution(n, cores):
    answer = 0
    m = len(cores)
    lst = [0] * m
    if n <= m:
        answer = n
    else:
        cnt = 0
        rslt = 0
        for t in range(n*max(cores)):
            for j in range(m):
                lst[j] += 1
                if lst[j] == cores[j]+1:
                    lst[j] = 1
                    answer = j+1
                    ### 여기서 1의 등장 횟수를 세어주면 된다
                    # print(lst)
                    for k in range(m):
                        if lst[k] == 1:
                            rslt += 1
                            if rslt == n:
                                # print(k + 1)
                                answer = k + 1
                                break
            if rslt == n:
                break
                
            #         cnt += 1
            #     if cnt == n:
            #         break
            # if cnt == n:
            #         break
    return answer