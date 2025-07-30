def move_nz_to_end(arr: list) -> None:
    n = len(arr)
    j = -1
    for i in range(n):
        if arr[i] == 0:
            j = i
            break
    if j == -1:
        return
    for i in range(j+1, n):
        if arr[i] != 0:
            arr[j], arr[i] = arr[i], arr[j]
            j += 1

t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))
    move_nz_to_end(arr)
    print(arr)