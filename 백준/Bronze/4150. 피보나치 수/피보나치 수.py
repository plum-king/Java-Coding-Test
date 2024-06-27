import sys
t = int(sys.stdin.readline())
arr = list()
arr.append(1)
arr.append(1)
for i in range (2, t):
    arr.append(arr[i-1]+arr[i-2])
print(arr[t-1])