def Count_Frequency(arr: list, n: int) -> None:
    frequency_map = {}
    for x in arr:
        frequency_map[x] = frequency_map.get(x,0) + 1
    for key , value in frequency_map.items():
        print(f"{key} -> {value}")
    
    
t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    arr = list(map(int, input().split()))

    Count_Frequency(arr, n)
    print()
    
