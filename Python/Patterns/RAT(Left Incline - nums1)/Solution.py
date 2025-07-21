# For an input n = 5 
# Print the RAT - left incline Pattern using numbers.
#  1
#  2 2
#  3 3 3
#  4 4 3 4
#  5 5 5 5 5

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(1, n+1):
        for j in range(1,i+1):
            print(i, " ", end="")
        print()
    print()
    t -= 1