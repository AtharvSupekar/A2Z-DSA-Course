"""
    Brute Force Solution
    TC = O(2N) rather O(1.5N)
    SC = O(N)

    For Optimal Solution
    TC = O(N)
    SC = O(N)

    For Variant Solution
    TC = O(2N)
    SC = O(N)
"""
from typing import List

def BruteForce(nums: List[int]) -> List[int]:
    n = len(nums)
    pos, neg = [], []
    for num in nums:
        if num >= 0:
            pos.append(num)
        else:
            neg.append(num)
    for i in range(n // 2):
        nums[2 * i] = pos[i]
        nums[2 * i + 1] = neg[i]
    return nums

def Optimal(nums: List[int]) -> List[int]:
    posIdx, negIdx = 0, 1
    res = [0] * len(nums)
    for num in nums:
        if num < 0:
            res[negIdx] = num
            negIdx += 2
        else:
            res[posIdx] = num
            posIdx += 2
    return res

def Variant2(nums: List[int]) -> List[int]:
    n = len(nums)
    pos, neg = [], []
    for num in nums:
        if num < 0:
            neg.append(num)
        else:
            pos.append(num)
    if len(pos) > len(neg):
        for i in range(len(neg)):
            nums[2 * i] = pos[i]
            nums[2*i+1] = neg[i]
        index = 2 * len(neg)
        for i in range(len(pos) - len(neg)):
            nums[index] = pos[i + len(neg)]
            index += 1
    else:
        for i in range(len(pos)):
            nums[2 * i] = pos[i]
            nums[2*i+1] = neg[i]
        index = 2 * len(pos)
        for i in range(len(neg) - len(pos)):
            nums[index] = neg[i + len(pos)]
            index += 1
    return nums

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    arr: list[int] = list(map(int, input().split()))
    # print(BruteForce(arr))
    # print(Optimal(arr))
    print(Variant2(arr))

