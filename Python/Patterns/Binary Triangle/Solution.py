# For an input n = 5 
# Print the RAT - left incline Pattern using '0' and '1'.
#  1
#  0 1
#  1 0 1
#  0 1 0 1
#  1 0 1 0 1

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(1, n+1):
        start = 0 if i % 2 == 0 else 1
        for j in range(1,i+1):
            print(start, " ", end="")
            start = 1 - start
        print()
    print()
    t -= 1