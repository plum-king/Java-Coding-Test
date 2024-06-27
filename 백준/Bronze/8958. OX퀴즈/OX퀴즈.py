#import sys
#input = sys.stdin.readline()

t = int(input())
for i in range(t):
    str = input()
    sum = 0
    b = 0
    for j in str:
        if j == 'X':
            b = 0
        else:
            b += 1
        sum += b
    print(sum)