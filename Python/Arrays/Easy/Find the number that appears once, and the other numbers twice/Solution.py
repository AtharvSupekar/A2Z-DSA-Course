''' 
    TC = O(N)
    SC = O(1)
'''

from typing import List

def single_number(arr1: List[int]) -> int:
    xor = 0
    for num in arr:
        xor ^= num
    return xor


# Main execution block: Handles input/output for testing
t = int(input()) # Read number of test cases
while t > 0:
    t -= 1
    # Read elements for arr
    arr = list(map(int, input().split()))
    print(single_number(arr))