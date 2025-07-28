def remove_dups(arr: list) -> int:
    n: int = len(arr)
    slow: int = 0
    for fast in range(1, n):
        if arr[fast] != arr[slow]:
            slow += 1
            arr[slow] = arr[fast]
    return slow + 1
t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))
    new_len: int = remove_dups(arr)
    print(new_len)
    print(arr[:new_len])