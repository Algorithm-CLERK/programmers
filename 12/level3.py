import heapq


def solution(n, works):
    if sum(works) < n:
        return 0

    q = [[-w, w] for w in works]
    heapq.heapify(q)
    for i in range(n):
        val1, val2 = heapq.heappop(q)
        val2 -= 1
        heapq.heappush(q, [-val2, val2])

    res = 0
    while q:
        val1, val2 = heapq.heappop(q)
        res += val2 ** 2

    return res
