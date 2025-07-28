def LargestElement(arr: list) -> int:
    largest: int = arr[0]
    for num in arr:
        if largest < num:
            largest = num
    return largest

t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))
    print(LargestElement(arr))