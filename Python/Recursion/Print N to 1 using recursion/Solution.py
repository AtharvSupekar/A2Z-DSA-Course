def print_NTo1(n, i):
    if i<1:
        return
    print(i)
    print_NTo1(n, i-1)


t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    print_NTo1(n, n)
    print()  # Print a newline after each test case
