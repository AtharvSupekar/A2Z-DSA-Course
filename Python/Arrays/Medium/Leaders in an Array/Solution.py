"""
    Brute Force Approach -
    TC = O(n^2) or O((n * (n + 1)) / 2)
    SC = O(n) - Worst Case (If array is sorted in descending order)

    Optimal Approach -
    TC = O(n)
    SC = O(n) - Worst Case (If array is sorted in descending order)
"""
from typing import List
from utils import timer

@timer
def find_leaders_BF(arr: List[int]) -> List[int]:
        n = len(arr)
        leaders = [arr[-1]]
        for i in range(n - 1):
            is_leader = True
            for j in range(i + 1, n):
                if arr[i] <= arr[j]:
                    is_leader = False
            if is_leader:
                leaders.append(arr[i])
        return leaders
@timer
def find_leaders_OP(arr: List[int]) -> List[int]:
    n = len(arr)
    leaders = [arr[-1]]
    max_yet = arr[-1]
    for i in range(n - 1, 0, -1):
        if arr[i] > max_yet:
            max_yet = arr[i]
            leaders.append(arr[i])
    return leaders



# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    arr: list[int] = list(map(int, input().split(" ")))
    find_leaders_OP(arr)
    find_leaders_BF(arr)



