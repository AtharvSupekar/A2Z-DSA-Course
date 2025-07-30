def reverse(arr: list, start: int, end: int) -> None:
    while start < end:
        temp: int = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start += 1
        end -= 1

def rotate_k(arr: list, k: int) -> None:
    n: int = len(arr)
    k = k % n
    arr[0:k] = arr[0:k][::-1]
    arr[k:n] = arr[k:n][::-1]
    arr[::] = arr[0:n][::-1]

def Rotate_k(arr: list, k: int) -> None:
    n: int = len(arr)
    k = k % n
    reverse(arr, 0, k-1)
    reverse(arr, k, n-1)
    reverse(arr, 0, n-1)

t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))
    k = int(input())
    Rotate_k(arr, k)
    print(arr)