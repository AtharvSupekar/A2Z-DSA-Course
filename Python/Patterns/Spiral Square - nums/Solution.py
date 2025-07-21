#  For an input n = 5 
#  Print the Solid Square Pattern using numbers.
#     5 5 5 5 5 5 5 5 5 
#     5 4 4 4 4 4 4 4 5 
#     5 4 3 3 3 3 3 4 5 
#     5 4 3 2 2 2 3 4 5 
#     5 4 3 2 1 2 3 4 5 
#     5 4 3 2 2 2 3 4 5 
#     5 4 3 3 3 3 3 4 5 
#     5 4 4 4 4 4 4 4 5 
#     5 5 5 5 5 5 5 5 5 

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(2*n - 1):
        for j in range(2*n - 1):
            top, left, down, right = i, j , 2*n-1-1-i, 2*n-1-1-j
            print(n - min(top,left,down,right), end = " ")
        print()
    print()
    t -= 1