def Fibonacci(n: int) -> int:
    # Base Condition
    if n <= 1:
        return n
    # Recursive Call
    return Fibonacci(n-1) + Fibonacci(n-2)
    
    
t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    if n < 0:
        print("Invalid input, please enter a valid string.")
        continue
    # n-1 because of 1-based indexing 
    print(Fibonacci(n-1))
    
