''' 
    TC = O(2N)
    SC = O(1)
'''

from typing import List

def Two_Sum_BF(arr: list, k: int) -> list:
    n = len(arr)
    for i in range(1,n):
        for j in range(i,n):
            # Check adjacent elements (i spaces apart)
            if arr[j] + arr[j - i] == k:
                return [i, j - i]
    return [-1, -1]
    
def Two_Sum_OP(arr: list, k: int) -> list:
    n = len(arr)
    left, right = 0, n-1
    while left < right:
        total = arr[left] + arr[right]
        if total == k:
            return [left, right]
        if total > k:
            right -= 1
        if total < k:
            left += 1
    return [-1, -1]
            
    
# Main execution block: Handles input/output for testing
t = int(input()) # Read number of test cases
while t > 0:
    t -= 1
    # Read elements for arr
    arr = list(map(int, input().split()))
    k = int(input())
    print(Two_Sum_BF(arr,k))
    print(Two_Sum_OP(arr,k))
