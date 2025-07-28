def LargestElement(arr: list) -> bool:
    n: int = len(arr)
    for i in range(1, n):
        if arr[i] >= arr[i-1]:
            continue
        else:
            return False
    return True
t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))
    print(LargestElement(arr))