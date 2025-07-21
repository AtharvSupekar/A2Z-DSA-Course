# For an input n = 5 
# Print the RAT - left incline Pattern using stars.
#      *
#     ***
#    ***** 
#   *******
#  *********
# Approach -> [space, stars, space]
# Line 1 -> [4,1,4]
# Line 2 -> [3,3,3]
# Line 3 -> [2,5,2]
# Line 4 -> [1,7,1]
# Line 5 -> [0,9,0]

t = int(input())
while t >= 1:
    n = int(input())
    # Outer Loop
    for i in range(0, n):
        # # Inner Loop
        # # space
        # for j in range(0, n-i-1):
        #     print(" ", end = "")
        # # stars
        # for j in range(0, 2*i+1):
        #     print("*", end = "")
        # # space
        # for j in range(0, n-i-1):
        #     print(" ", end = "")
        print(" " * (n-i-1), end = "")
        print("*" * (2*i+1), end = "")
        print(" " * (n-i-1), end = "")
        print()
    print()
    t -= 1