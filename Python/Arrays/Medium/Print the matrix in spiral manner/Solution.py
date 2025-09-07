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

@timer
def print_Spiral(nums: List[List[int]]) -> List[List[int]]:
    return nums

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    rows, cols = map(int, input().split(" "))
    matrix = [list(map(int, input().split()))[:cols] for i in range(rows)]

    # result_BF = rotate_90_BF(matrix, ACW=False)
    # print_matrix(result_BF)
    result_OP = print_Spiral(matrix, ACW=True)
    print_matrix(result_OP)
    result_OP = print_Spiral(result_OP, ACW=True)
    print_matrix(result_OP)




