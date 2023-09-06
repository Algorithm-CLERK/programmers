#    def solution(n, works):
#         i = 0
#         while i != n:
#             works = sorted(works, reverse=True)
#             if not works[0] == 0:
#                 for j in range(len(works)):
#                     if works[j] == works[0]:
#                         works[j] -=1
#                         i += 1
#                         break
#                     else:
#                         break
#             else:
#                 break
   
#         for number in works:
#             answer += number ** 2
    
import heapq

def solution(n, works):
    if n >= sum(works):
        return 0

    works = [-w for w in works]
    # print(works) [-2, -15, -22, -55, -55]
    heapq.heapify(works)
    # print(works) # [-55, -55, -22, -2, -15]
    
    for _ in range(n):
        # 가장 작은 작업 양을 가진 i를 빼서 1을 더해준 다음 works에 다시 넣어주기
        i = heapq.heappop(works)
        i += 1
        heapq.heappush(works, i)
    return sum([w ** 2 for w in works])