# For an input n = 5 
# Print the Inverse RAT - left incline Pattern using numbers.
#  1 2 3 4 5 
#  1 2 3  4
#  1 2 3
#  1 2 
#  1

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(n+1, 0, -1):
        for j in range(1,i+1):
            print(j, end=" ")
        print()
    print()
    t -= 1