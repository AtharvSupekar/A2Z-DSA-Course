"""
    Brute Force Approach -
        TC = O(n*n*n)
        SC = O(1)
    Better Approach -
        TC = O(n*n)
        SC = O(1)
    Optimal Approach -
        TC = O(n)
        SC = O(n) Worst Case for HashMap
"""
from typing import List
from utils import timer

@timer
def count_subarrays_sum_equals_k_BF(nums: List[List[int]], target: int) -> int:
    n = len(nums)
    count = 0
    for i in range(n):
        for j in range(i, n):
            total = 0
            for k in range(i, j + 1):
                total += nums[k]
            if total == target:
                count += 1
    return count

@timer
def count_subarrays_sum_equals_k_Better(nums: List[List[int]], target: int) -> int:
    n = len(nums)
    count = 0
    for i in range(n):
        total = 0
        for j in range(i, n):
            total += nums[j]
            if total == target:
                count += 1
    return count

@timer
def count_subarrays_sum_equals_k_OP(nums: List[List[int]], target: int) -> int:
    count, pre_sum = 0, 0
    pre_sum_map = dict()
    pre_sum_map[0] = 1
    for num in nums:
        pre_sum += num
        remove = pre_sum - target
        count += pre_sum_map.get(remove, 0)
        pre_sum_map[pre_sum] = pre_sum_map.get(pre_sum, 0) + 1
    return count

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    arr: List[int] = list(map(int, input().split(" ")))
    k: int = int(input())

    result_BF = count_subarrays_sum_equals_k_BF(arr, k)
    result_Better = count_subarrays_sum_equals_k_Better(arr, k)
    result_OP = count_subarrays_sum_equals_k_OP(arr, k)




