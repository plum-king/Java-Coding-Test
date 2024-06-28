import sys
from collections import deque

n, m, v = map(int, sys.stdin.readline().split())
graph = [[False] * (n+1) for _ in range(n+1)]
visited1 = [False] * (n+1)
visited2 = [False] * (n+1)

# print(graph)
for i in range(m):
    a, b = map(int, sys.stdin.readline().split())
    graph[a][b] = True
    graph[b][a] = True

def dfs(v):
    visited1[v] = True
    print(v, end = " ")
    for i in range(1, n+1):
        if graph[v][i] and not visited1[i]:
            dfs(i)

def bfs(v):
    queue = deque([v])
    visited2[v] = True
    while queue:
        v = queue.popleft()
        print(v, end = " ")
        for i in range(1, n+1):
            if not visited2[i] and graph[v][i]:
                queue.append(i)
                visited2[i] = True

dfs(v)
print()
bfs(v)