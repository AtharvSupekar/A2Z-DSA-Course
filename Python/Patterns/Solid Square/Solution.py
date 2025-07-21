#
# For an input n = 5 
# Print the Solid Square Pattern using '*'.
#  *  *  *  *  *
#  *  *  *  *  *
#  *  *  *  *  *
#  *  *  *  *  *
#  *  *  *  *  *

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(n):
        for j in range(n):
            print("*  ", end="")
        print()
        #       OR
        # print("*  " * n)
    print()
    t -= 1