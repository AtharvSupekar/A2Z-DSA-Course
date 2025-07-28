def partition(arr: list, low: int, high: int) -> int:
    pivot, i, j = arr[low], low, high

    while i < j:
        while arr[i] <= pivot and i <= high - 1:
            i += 1
        while arr[i] >  pivot and j >= low  + 1:
            j -= 1
        if i < j:
            arr[i], arr[j] = arr[j], arr[i]
    
    arr[low], arr[j] = arr[j], arr[low]
    return j

def Quick_Sort(arr: list, low: int, high: int) -> None:
    """
    Sorts an array using the Merge Sort algorithm.
    
    :param arr: List of elements to be sorted
    :return: Sorted list
    """
    # Base Condition - 
    # If low is less than high, there's more than one element to sort
    if low < high:
        pIndex = partition(arr, low, high)
        Quick_Sort(arr, low, pIndex - 1)
        Quick_Sort(arr, pIndex + 1, high) 
    

t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))

    Quick_Sort(arr = arr, low = 0, high = len(arr) - 1)
    print(arr)