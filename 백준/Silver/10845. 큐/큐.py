import sys
from collections import deque

t = int(sys.stdin.readline())

dq = deque()

for i in range(t):
    a = sys.stdin.readline().strip()
    if " " in a:
        a, b = a.split()
        b = int(b) # int로 변경
    if a == "push":
        dq.append(b)
    elif a == "front":
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[0])
    elif a == "back":
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[-1])
    elif a == "size":
        print(len(dq))
    elif a == "empty":
        if len(dq) == 0:
            print(1)
        else:
            print(0)
    else:
        if len(dq) == 0:
            print(-1)
        else:
            print(dq.popleft())