def solution(arr):
    s = []
    for a in arr:
        if s and s[-1] == a:
            continue
        else:
            s.append(a)
    return s
