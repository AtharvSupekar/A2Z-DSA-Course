"""
    Brute Force Approach -
    TC = O(M * N)
    SC = O(M * N)

    Optimal Approach -
    TC = O(3(M * N)/4)    # M/2  * N/2(transpose) + MN/2(reverse)
    SC = O(1) if M == N else O(M * N)
"""
from typing import List
from utils import timer, print_matrix

def _transpose(matrix: List[List[int]], rows: int, cols: int) -> None:
    if rows == cols:
        for i in range(rows - 1):
            for j in range(i + 1, cols):
                matrix[i][j], matrix[j][i] = matrix[j][i], matrix[i][j]
        return matrix
    else:
        transpose = [[matrix[j][i] for j in range(rows)] for i in range(cols)]
        return transpose

@timer
def rotate_90_BF(nums: List[List[int]], ACW: bool = False) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])
    result = [[0] * rows for _ in range(cols)]
    for i in range(rows):
        for j in range(cols):
            if ACW:
                result[cols - 1 - j][i] = nums[i][j]
            else:
                result[j][rows - 1 - i] = nums[i][j]
    return result

@timer
def rotate_90_OP(nums: List[List[int]], ACW: bool = False) -> List[List[int]]:
    rows, cols = len(nums), len(nums[0])
    tp = _transpose(nums, rows, cols)
    tpRows, tpCols = len(tp), len(tp[0])
    if ACW:
        for j in range(tpCols):
            left, right = 0, tpRows - 1
            while left < right:
                tp[left][j], tp[right][j] = tp[right][j], tp[left][j]
                left += 1
                right -= 1
    else:
        for i in range(tpCols):
            tp[i].reverse()
    return tp

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    rows, cols = map(int, input().split(" "))
    matrix = [list(map(int, input().split()))[:cols] for i in range(rows)]

    # result_BF = rotate_90_BF(matrix, ACW=False)
    # print_matrix(result_BF)
    result_OP = rotate_90_OP(matrix, ACW=True)
    print_matrix(result_OP)
    result_OP = rotate_90_OP(result_OP, ACW=True)
    print_matrix(result_OP)




