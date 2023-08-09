def solution(nums):
    answer = 0
    # 중복 원소 제거
    phoneketmon = set(nums)
    
    m = len(phoneketmon)
    n = len(nums)
    
    if m < n // 2:
        answer = m
    else:
        answer = n // 2
    return answer