def print_NTo1(n, i):
    if i > n:
        return
    print_NTo1(n, i+1)
    print(i)


t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    print_NTo1(n, 1)
    print()  # Print a newline after each test case
