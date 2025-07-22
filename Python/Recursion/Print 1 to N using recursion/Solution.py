def print_1ToN(n, i=1):
    if i>n:
        return
    print(i)
    print_1ToN(n, i+1)


t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    i = 1
    print_1ToN(n, i)
    print()  # Print a newline after each test case
