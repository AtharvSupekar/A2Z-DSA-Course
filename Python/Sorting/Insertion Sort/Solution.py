def Insertion_Sort(arr: list) -> None:
    """
    Sorts an array using the Insertion Sort algorithm.
    
    :param arr: List of elements to be sorted
    :return: Sorted list
    """
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        j = i-1
        while j>=0 and arr[j] > key:
            arr[j+1] = arr[j]
            j -= 1
        arr[j+1] = key 


t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))

    Insertion_Sort(arr)
    print(arr)