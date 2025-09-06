"""
    Brute Force Approach -
    TC = O((M * N) * (M * N))
    SC = O(1)

    Better Approach -
    TC = O(M * N)
    SC = O(M + N)

    Optimal Approach -
    TC = O(M * N)
    SC = O(1)
"""
import random
from math import inf
from typing import List
from utils import timer, print_matrix

def _mark_row(i: int, cols: int, nums: List[List[int]]) -> None:
    for j in range(cols):
        if nums[i][j] != 0:
            nums[i][j] = None
def _mark_col(j: int, rows: int, nums: List[List[int]]) -> None:
    for i in range(rows):
        if nums[i][j] != 0:
            nums[i][j] = None

@timer
def set_zeroes_BF(nums: List[List[int]]) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])
    for i in range(rows):
        for j in range(cols):
            if nums[i][j] == 0:
                _mark_row(i, cols, nums)
                _mark_col(j, rows, nums)
    for i in range(rows):
        for j in range(cols):
            if nums[i][j] == None:
                nums[i][j] = 0
    return nums

@timer
def set_zeroes_Better(nums: List[List[int]]) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])
    row_to_zero = [0] * rows
    col_to_zero = [0] * cols
    for i in range(rows):
        for j in range(cols):
            if nums[i][j] == 0:
                row_to_zero[i] = 1
                col_to_zero[j] = 1
    for i in range(rows):
        for j in range(cols):
            if row_to_zero[i] == 1 or col_to_zero[j] == 1:
                nums[i][j] = 0
    return nums

@timer
def set_zeroes_OP(nums: List[List[int]]) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])
    col0 = 1
    for i in range(rows):
        for j in range(cols):
            if nums[i][j] == 0:
                nums[i][0] = 0
                if j != 0:
                    nums[0][j] = 0
                else:
                    col0 = 0
    for i in range(1, rows):
        for j in range(1, cols):
            if nums[0][j] == 0 or nums[i][0] == 0:
                nums[i][j] = 0
    if nums[0][0] == 0:
        for j in range(cols):
            nums[0][j] = 0
    if col0 == 0:
        for i in range(rows):
            nums[i][0] = 0
    return nums

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    rows, cols = map(int, input().split(" "))
    matrix = [list(map(int, input().split()))[:cols] for i in range(rows)]

    # result_BF = set_zeroes_BF(matrix)
    # print_matrix(result_BF)
    # result_Better = set_zeroes_Better(matrix)
    # print_matrix(result_Better)
    result_OP = set_zeroes_OP(matrix)
    print_matrix(result_OP)




