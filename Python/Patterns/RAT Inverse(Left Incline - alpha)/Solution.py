# For an input n = 5 
# Print the RAT Inverted - left incline Pattern using alphabets.
# A B C D E 
# A B C D 
# A B C 
# A B 
# A 

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(n):
        for j in range(n-i):
            print(chr(65 + j), end=" ")
        print()
    print()
    t -= 1