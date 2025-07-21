# For an input n = 5 
# Print the RAT - left incline Pattern using '*'.
#  *
#  *  *
#  *  *  *
#  *  *  *  *
#  *  *  *  *  *

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(n):
        # for j in range(i+1):
        #     print("*  ", end="")
        # print()
        #      OR
        print("*  " * (i+1))
    print()
    t -= 1