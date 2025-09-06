"""
    Brute Force Approach -
    TC = O()
    SC = O()

    Better Approach -
    TC = O()
    SC = O()

    Optimal Approach -
    TC = O()
    SC = O()
"""
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
def rotate_90_BF(nums: List[List[int]]) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])

    return nums

@timer
def rotate_90_Better(nums: List[List[int]]) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])

    return nums

@timer
def rotate_90_OP(nums: List[List[int]]) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])

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
    # result_OP = set_zeroes_OP(matrix)
    # print_matrix(result_OP)




