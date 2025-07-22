def print_1ToN(n, i):
    if i<1:
        return
    print_1ToN(n, i-1)
    print(i)


t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    print_1ToN(n, n)
    print()  # Print a newline after each test case
