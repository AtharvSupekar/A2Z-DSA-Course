def Selection_Sort(arr: list) -> list:
    """
    Sorts an array using the Selection Sort algorithm.
    
    :param arr: List of elements to be sorted
    :return: Sorted list
    """
    n = len(arr)
    for i in range(n-1):
        min_idx = i
        for j in range(i+1,n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        
        arr[i], arr[min_idx] = arr[min_idx], arr[i]            
    return arr
        
t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))

    print(Selection_Sort(arr))