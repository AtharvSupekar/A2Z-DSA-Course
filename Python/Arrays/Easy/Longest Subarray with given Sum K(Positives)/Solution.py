''' 
    TC = O(2N)
    SC = O(1)
'''

from typing import List

def Longest_Subarray(arr: List[int], k: int) -> List[int]:
    sum, maxLen = 0, 0
    preSumMap = {0: -1}
    start_of_longest, end_of_longest = -1, -1
    for i in range(0, len(arr)):
        sum += arr[i]
        if (sum - k) in preSumMap:
            curr_length = i - preSumMap[sum - k]
            if curr_length > maxLen:
                maxLen = curr_length
                start_of_longest = preSumMap[sum - k] + 1
                end_of_longest = i

        if sum not in preSumMap:
            preSumMap[sum] = i
    if start_of_longest != -1:
        return arr[start_of_longest: end_of_longest + 1]
    else:
        return []

def Longest_Subarray_2P(arr: List[int], k: int) -> List[int]:
    left, right = 0, 0
    sum, maxLen = 0, 0
    n = len(arr)
    
    while right < n:
        sum += arr[right]
        while sum > k:
            sum -= arr[left]
            left += 1
        if sum == k:
            maxLen = max(maxLen, right - left + 1)
        right += 1
    return maxLen
    
# Main execution block: Handles input/output for testing
t = int(input()) # Read number of test cases
while t > 0:
    t -= 1
    # Read elements for arr
    arr = list(map(int, input().split()))
    k = int(input())
    print(Longest_Subarray_2P(arr,k))
