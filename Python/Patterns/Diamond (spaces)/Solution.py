# For an input n = 5 
# Print the RAT - left incline Pattern using alphabets.
#         A         
#       A B A       
#     A B C B A     
#   A B C D C B A   
# A B C D E D C B A 
# Approach -> [space, chars, space]
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
        # Spaces
        print("  " * (n-i-1), end = "")
        # Define breakpoint -> bp ; and the ch to be printed
        bp = (2*i+1) / 2
        ch = 65
        # Print the characters
        for j in range(0, 2*i+1):
            if j < bp-1: 
                print(chr(ch), end = " ")
                ch += 1 
            else:
                print(chr(ch), end = " ")
                ch -= 1
        # Spaces after
        print(" " * (n-i-1), end = "")
        print()
    print()
    t -= 1