# Read the number of test cases
try:
    t = int(input())
except (ValueError, EOFError):
    t = 0

# Loop through all test cases
for _ in range(t):
    # Read the two numbers for the current test case, separated by a space
    a, b = map(int, input().split())

    # Calculate the sum
    result = a + b

    # Print the result for this test case
    print(result)