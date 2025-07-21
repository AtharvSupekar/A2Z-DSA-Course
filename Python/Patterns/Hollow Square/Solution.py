#
# For an input n = 5 
# Print the Solid Square Pattern using '*'.
#   * * * * * 
#   *       * 
#   *       * 
#   *       * 
#   * * * * * 

t = int(input())
while t >= 1:
    n = int(input())
    for i in range(n):
        for j in range(n):
            if i == 0 or i == n-1 or j == 0 or j == n-1:
                print("* ", end="")
            else: 
                print("  ", end="")
        print()
    print()
    t -= 1