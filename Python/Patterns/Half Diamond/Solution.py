# For an input n = 5 
# Print the Half Diamond Pattern using '*'.
#  *
#  * *
#  * * *
#  * * * *
#  * * * * *
#  * * * *
#  * * *
#  * *
#  *

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(1, 2*n):
        stars = i
        if i > n: 
            stars = 2*n - i
        print("* " * stars)
    print()
    t -= 1