def Count_Frequency(arr: list, n: int) -> None:
    frequency_map = {}
    for x in arr:
        frequency_map[x] = frequency_map.get(x,0) + 1
    min_freq, max_freq = float('inf'), float('-inf')
    min_ele, max_ele = None, None
    for element, count in frequency_map.items():
        if count < min_freq:
            min_freq = count
            min_ele = element
        if count > max_freq:
            max_freq = count
            max_ele = element
    
    print(f"Highest Frequency Element: {max_ele} with frequency {max_freq}.")
    print(f"Lowest Frequency Element: {min_ele} with frequency {min_freq}.")
    
    
t = int(input())
while t > 0:
    t -= 1
    n = int(input())
    arr = list(map(int, input().split()))

    Count_Frequency(arr, n)
    print()
    
