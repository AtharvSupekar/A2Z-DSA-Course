# Functional Approach

def print_Sum(n):
    if n==0:
        return 0
    return n + print_Sum(n-1)


t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    if n < 0:
        print("Invalid input, please enter a non-negative integer.")
        continue
    print(print_Sum(n))
