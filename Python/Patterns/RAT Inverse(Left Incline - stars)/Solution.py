# For an input n = 5 
# Print the RAT - left incline Pattern using '*'.
#  * * * * * 
#  * * * *
#  * * *
#  * * 
#  * 

# NOTE - We can do this by either reversing the outer loop 
#        or changing the logic of inner loop to -> j<n-i+1

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(n, 0, -1):
        for j in range(i):
            print("* ", end="")
        print()
        #      OR
        # print("* " * (i))
    print()
    t -= 1