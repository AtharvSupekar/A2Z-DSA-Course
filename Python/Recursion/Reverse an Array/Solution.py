def Print_Array(arr):
    for i in arr:
        print(i, end = " ")
    print()

def Reverse_Array(arr, start = 0, length = 0):
    # Base Condition
    if start >= n//2:
        Print_Array(arr)
        return
    # Swap the elements
    arr[start], arr[n - start - 1] = arr[n - start - 1], arr[start]
    # Recursive Call
    Reverse_Array(arr, start + 1, n)


t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    arr = list(map(int, input().split()))
    if n <= 0:
        print("Invalid input, please enter a valid array size.")
        continue
    Reverse_Array(arr, 0, n)
