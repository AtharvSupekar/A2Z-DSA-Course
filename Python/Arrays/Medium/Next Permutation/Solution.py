"""
    Brute Force Solution -
    Generate all possible combinations and then perform a linear search
    TC = O(N! * N)
    SC = O(N!)

    For Optimal Solution
    TC = O(N)
    SC = O(1)
"""
from typing import List

def next_permutation(arr: List[int]) -> List[int]:
        n = len(arr)
        # 1. Find the breakpoint
        bp = -1
        for i in range(n - 2, -1, -1):
            if arr[i] < arr[i+1]:
                bp = i
                break
        # 2. If no breakpoint is found -> return reversed array
        if bp == -1:
            arr.reverse()
            return arr
        # 2. Find the smallest greater element to swap
        for i in range(n - 1, bp, -1):
            if arr[bp] < arr[i]:
                # 3. Perform the swap
                arr[bp], arr[i] = arr[i], arr[bp]
                break
        # 4. Reverse the part after breakpoint in-place to make it the smallest
        left, right = bp + 1, n - 1
        while left < right:
            arr[left], arr[right] = arr[right], arr[left]
            left += 1
            right -= 1
        return arr

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    perm: list[int] = list(map(int, input().split(" ")))
    print(next_permutation(perm))

