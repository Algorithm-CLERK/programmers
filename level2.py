def solution(s):
    stack = []
    for bracket in s:
        # stack이 비어있는 경우 무조건 추가
        if not stack:
            stack.append(bracket)
        # stack이 비어있지 않은 경우
        else:
            if bracket == '(':
                stack.append(bracket)
            else:
                if stack[-1] == '(':
                    stack.pop()
    if stack:
        return False
    else:
        return True