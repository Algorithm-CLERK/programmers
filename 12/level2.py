def solution(n):
    n_in_bin = bin(n)[2:]
    n_in_bin_cnt = n_in_bin.count('1')
    cur = n+1
    while True:
        cur_in_bin_cnt = bin(cur)[2:].count('1')
        if n_in_bin_cnt == cur_in_bin_cnt:
            return cur
        cur += 1