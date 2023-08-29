def solution(s):
    answer = True
    stack = []
    for item in s:
        if item == "(":
            stack.append(item)
        elif item == ")":
            if stack and stack.pop() == "(": continue
            answer = False
            return answer
    if stack:
        answer = False

    return answer