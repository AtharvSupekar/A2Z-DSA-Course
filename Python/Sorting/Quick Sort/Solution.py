def merge(arr: list, low: int, mid: int, high: int) -> None:
    left, right = low, mid + 1
    temp = []
    # Compare and add the smaller element to temp
    while left <= mid and right <= high:
        if arr[left] <= arr[right]:
            temp.append(arr[left])
            left += 1
        else:
            temp.append(arr[right])
            right += 1
    # Add any remaining elements is 1st half
    while left <= mid:
        temp.append(arr[left])
        left += 1
    # Add any remaining elements is 2nd half
    while right <= high:
        temp.append(arr[right])
        right += 1
    # Copy the merged elements from temp to arr(original)
    for k in range(low, high + 1):
        arr[k] = temp[k - low]

def Merge_Sort(arr: list, low: int, high: int) -> None:
    """
    Sorts an array using the Merge Sort algorithm.
    
    :param arr: List of elements to be sorted
    :return: Sorted list
    """
    n = len(arr)
    # Base Condition - 
    # when reach divided sub array is indivisible (len = 1)
    if low == high: return
    # Calculate mid of the array
    mid = (low + high) // 2
    # Call Merge Sort on left half
    Merge_Sort(arr, low, mid)
    # Call Merge Sort on right half
    Merge_Sort(arr, mid + 1, high)
    # Merge both the halves obtained in sorted order
    merge(arr, low, mid, high)

t = int(input())
while t>0:  
    t -= 1
    arr = list(map(int, input().split()))

    Merge_Sort(arr = arr, low = 0, high = len(arr) - 1)
    print(arr)