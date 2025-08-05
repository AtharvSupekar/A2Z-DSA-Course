''' 
    For the Counting Sort
    TC = O(2N)
    SC = O(1)

    For Dutch National Flag Algorithm
    TC = O(n) - Single Pass Algo
    SC = O(1)
'''
from typing import List

def sortColors(nums: List[int]) -> None:
    low, mid = 0, 0
    high = len(nums) - 1
    while mid <= high:
        match nums[mid]:
            case 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            case 1:
                mid += 1
            case 2:
                nums[mid], nums[high] = nums[high], nums[mid]
                high -= 1
    
# Main execution block: Handles input/output for testing
t = int(input()) # Read number of test cases
while t > 0:
    t -= 1
    # Read elements for arr
    arr = list(map(int, input().split()))
    sortColors(arr)
    print(arr)
