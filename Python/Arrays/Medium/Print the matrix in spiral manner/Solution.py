"""
    Optimal Approach -
    TC = O(M * N)
    SC = O(M * N) if list is returned
       = O(1) if elements are directly printed
"""
from typing import List
from utils import timer, print_matrix

@timer
def print_Spiral(nums: List[List[int]]) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])
    result = []
    top, bot, left, right = 0, rows - 1, 0, cols - 1
    while top <= bot and left <= right:
        for i in range(left, right + 1):
            result.append(nums[top][i])
        top += 1
        for i in range(top, bot + 1):
            result.append(nums[i][right])
        right -= 1
        if top <= bot:
            for i in range(right, left - 1, -1):
                result.append(nums[bot][i])
            bot -= 1
        if left <= right:
            for i in range(bot, top - 1, -1):
                result.append(nums[i][left])
            left += 1
    return result

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    rows, cols = map(int, input().split(" "))
    matrix = [list(map(int, input().split()))[:cols] for i in range(rows)]

    result = print_Spiral(matrix)




