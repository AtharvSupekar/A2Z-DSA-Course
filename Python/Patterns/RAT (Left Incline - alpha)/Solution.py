# For an input n = 5 
# Print the RAT - left incline Pattern using alphabets.
#  A
#  A B
#  A B C
#  A B C D
#  A B C D E

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(n):
        for j in range(i+1):
            print(chr(65 + j), end=" ")
        print()
    print()
    t -= 1