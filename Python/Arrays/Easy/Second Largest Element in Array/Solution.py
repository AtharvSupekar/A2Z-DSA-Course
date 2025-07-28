def secondLargest(arr: list) -> int:
    secondLargest: int = -1
    Largest: int = arr[0]
    for i, num in enumerate(arr):
        if num > Largest:
            secondLargest = Largest
            Largest = num
        elif Largest > num > secondLargest:
            secondLargest = num
    return secondLargest

def secondSmallest(arr: list) -> int:
    secondSmallest: int = float('inf')
    Smallest : int = arr[0]
    for i, num in enumerate(arr):
        if num < Smallest:
            secondSmallest = Smallest
            Smallest = num
        elif Smallest < num < secondSmallest:
            secondSmallest = num
    return secondSmallest

    
t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))
    res = [secondLargest(arr), secondSmallest(arr)]
    print(res)