def Bubble_Sort(arr: list) -> list:
    """
    Sorts an array using the Bubble Sort algorithm.
    
    :param arr: List of elements to be sorted
    :return: Sorted list
    """
    n = len(arr)
    for i in range(n-1):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        if not swapped:
            break
    return arr
        
t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))

    print(Bubble_Sort(arr))