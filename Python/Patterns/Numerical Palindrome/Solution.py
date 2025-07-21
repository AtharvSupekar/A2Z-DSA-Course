# For an input n = 5 
# Print the RAT - left incline Pattern using numbers.
# 1      1
# 12    21
# 123  321
# 12344321
# Approach -> [num, space, num]
# Line 1 -> [1,6,1]
# Line 2 -> [2,4,2]
# Line 2 -> [3,2,3]
# Line 3 -> [4,0,4]

t = int(input())
while t >= 1:
    n = int(input())
    space = 2 * (n-1)
    for i in range(1, n+1):
        # nums
        for j in range(1,i+1):
            print(j, " ", end="")
        # spaces
        for j in range(1, space+1):
            print("   ", end = "")
        # nums
        for j in range(i,0,-1):
            print(j, " ", end="")
        print()
        space -= 2
    print()
    t -= 1