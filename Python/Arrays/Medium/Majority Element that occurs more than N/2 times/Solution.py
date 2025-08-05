''' 
    Using Map or even MergeSort
    TC = O(2N)
    SC = O(N) for map and O(1) for MS
    
    For Moore Voting Algorithm
    TC = O(n) - Single Pass Algo (if given that a 
                majority element always exists - else O(2n))
    SC = O(1)
'''
from typing import List

def majorityElement(nums: List[int]) -> int:
    # Moore's Voting Algo
    cnt = target = 0
    n = len(nums)
    for num in nums:
        if cnt == 0:
            cnt += 1
            target = num
        elif num == target:
            cnt += 1
        else:
            cnt -= 1
    return target
    
# Main execution block: Handles input/output for testing
t = int(input()) # Read number of test cases
while t > 0:
    t -= 1
    # Read elements for arr
    arr = list(map(int, input().split()))
    print(majorityElement(arr))
