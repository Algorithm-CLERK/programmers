def solution(n, cores):
    if n < len(cores):
        return n
    n -= len(cores)

    l, r = 1, max(cores) * n
    time = int(1e9)
    while l <= r:
        mid = (l + r) // 2
        temp = 0
        for core in cores:
            temp += (mid // core)

        if temp >= n:
            time = min(time, mid)
            r = mid - 1
        elif temp < n:
            l = mid + 1

    for core in cores:
        n -= (time - 1) // core

    for i, core in enumerate(cores):
        if time % core == 0:
            n -= 1
        if n == 0:
            return i + 1