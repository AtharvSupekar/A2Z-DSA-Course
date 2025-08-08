"""
    Brute Force Solution
    TC = O(N²)
    SC = O(1)

    For Kadane's Algorithm
    TC = O(n)
    SC = O(1)
"""
from typing import List

def max_subarray_sum_BF(nums: List[int]) -> int:
    n: int = len(nums)
    maximum: int = float('-inf')
    for i in range(n):
        sum_ = 0
        for j in range(i, n):
            sum_ += nums[j]
            maximum = max(maximum, sum_)
    return maximum
def max_subarray_sum_OP(nums: List[int]) -> int:
    n: int = len(nums)
    maximum: int = float('-inf')
    sum_: int = 0
    for i in range(n):
        sum_ += nums[i]
        if sum_ > maximum:
            maximum = sum_
        if sum_ < 0:
            sum_ = 0
    return maximum

def print_max_subarray(nums: List[int]) -> None:
    n: int = len(nums)
    maximum: int = float('-inf')
    curr_start: int = 0
    start, end = -1, -1
    sum_: int = 0
    for i in range(n):
        if sum_ == 0:
            curr_start = i
        sum_ += nums[i]
        if sum_ > maximum:
            maximum = sum_
            start = curr_start
            end = i
        if sum_ < 0:
            sum_ = 0
    print(nums[start:end+1])

t: int = int(input())  # Read number of test cases
while t > 0:
    t -= 1
    # Read elements for arr
    arr: list[int] = list(map(int, input().split()))
    # print(max_subarray_sum_BF(arr), end = " ")
    print(max_subarray_sum_OP(arr))
    print_max_subarray(arr)
    
