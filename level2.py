def solution(land):
    n = len(land)
    dp = [[0]*4 for _ in range(n)]
    
    for j in range(4):
        dp[0][j] = land[0][j]
        
    for i in range(1, n):
        for j in range(4):
            before = dp[i-1][:j] + dp[i-1][j+1:]
            dp[i][j] = max(before) + land[i][j]
            
    return max(dp[-1])
