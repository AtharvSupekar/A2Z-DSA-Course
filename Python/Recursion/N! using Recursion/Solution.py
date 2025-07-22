# Parameterized Approach

def print_Factorial(n, factorial=1):
    if n == 1:
        print(factorial)
        return
    print_Factorial(n - 1, factorial * n)


t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    if n <= 0:
        print("Invalid input, please enter an integer >= 1.")
        continue
    print_Factorial(n, factorial=1)
