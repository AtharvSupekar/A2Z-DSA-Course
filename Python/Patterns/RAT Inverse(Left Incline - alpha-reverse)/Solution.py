# For an input n = 5 
# Print the RAT - left incline Pattern using alphabets.
# * * * * * * * * * * 
# * * * *     * * * * 
# * * *         * * * 
# * *             * * 
# *                 * 
# *                 * 
# * *             * * 
# * * *         * * * 
# * * * *     * * * * 
# * * * * * * * * * * 
# Approach -> [stars, space, stars]
# Line 1 -> [5,0,5]
# Line 2 -> [4,2,4]
# Line 3 -> [3,4,3]
# Line 4 -> [2,6,2]
# Line 5 -> [1,8,1]
t = int(input())
while t >= 1:
    n = int(input())
    iniS = 0
    for i in range(n):
        print("* " * (n-i), end = "")
        print("  " * iniS , end = "")
        print("* " * (n-i), end = "")
        iniS += 2
        print()
    iniS = 2 * (n-1)
    for i in range(n):
        print("* " * (i+1), end = "")
        print("  " * iniS , end = "")
        print("* " * (i+1), end = "")
        iniS -= 2
        print()
    print()
    t -= 1