"""
    Brute Force Approach -
    TC = O(n^2)
    SC = O(1)

    Better Approach -
    TC = O(nlogn) - sorting
    SC = O(1)

    Optimal Approach -
    TC = O(n)
    SC = O(n)
"""
from math import inf
from typing import List
from utils import timer

@timer
def longest_consecutive_BF(nums: List[int]) -> int:
    n = len(nums)
    longest = 0
    for i in range(n):
        count = 1
        num = nums[i]
        while num + count in nums:
            count += 1
        longest = max(count, longest)
    return longest

@timer
def longest_consecutive_Better(nums: List[int]) -> int:
    nums.sort()
    n, longest, count_current, last_smaller = len(nums), 0, 0, -inf

    for i in range(n):
        if nums[i] - 1 == last_smaller:
            count_current += 1
            last_smaller = nums[i]
        elif nums[i] != last_smaller:
            count_current = 1
            last_smaller = nums[i]
        longest = max(count_current, longest)
    return longest

@timer
def longest_consecutive_OP(nums: List[int]) -> int:
    if not nums:
        return 0

    nums = sorted(set(nums))

    max_len = 1
    curr_max_len = 1
    for i in range(1, len(nums)):
        if nums[i] - nums[i - 1] == 1:
            curr_max_len += 1
        else:
            max_len = max(max_len, curr_max_len)
            curr_max_len = 1
    max_len = max(max_len, curr_max_len)

    return max_len

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    arr: list[int] = list(map(int, input().split(" ")))
    longest_consecutive_BF(arr)
    longest_consecutive_Better(arr)
    longest_consecutive_OP(arr)



