"""
    Pascal's Triangle is a triangular array of binomial coefficients. Each number is the sum of the two numbers directly above it. The first row is 1, and every row starts and ends with 1.
    There are three common variations of this problem:
        1. Find a specific element: Given a row r and column c, find the value at that position.
        2. Print a specific row: Given a row r, print all the elements in that row.
        3. Print the entire triangle: Given a number of rows n, print the entire triangle up to n rows.

    Find a specific element:
        TC = O(c)
        SC = O(1)
    Print a specific row:
        TC = O(n)
        SC = O(1)
    Print the entire triangle:
        TC = O(n*n)
        SC = O(1)
"""
from typing import List
from utils import timer, print_matrix

@timer
def pascals_traingle_num(n: int, r: int) -> int:
    # Using nCr formula - (r-1)C(c-1)
    # Note -> n = row ; r = col
    n, r = n - 1, r - 1
    res = 1
    for i in range(r):
        res = res * (n - i)
        res = res // (i + 1)
    return res

# @timer
def pascals_traingle_row(n: int) -> List[int]:
    res = [1]
    num = 1
    mid = n//2 if n & 1 == 0 else n // 2 + 1
    for i in range(1, mid):
        num *= n - i
        num //= i
        res.append(num)
    if n & 1 == 0:
        res.extend(reversed(res))
    else:
        res.extend(reversed(res[:-1]))
    return res

@timer
def pascals_traingle_whole(n: int) -> int:
    result = []
    for i in range(1, n + 1):
        result.append(pascals_traingle_row(i))
    return result

# Main Execution  Block
t: int = int(input())
while t > 0:
    t -= 1
    # # Variant 1:
    # r, c = map(int, input().split())
    # pascals_traingle_num(r, c)

    # # Variant 2:
    # r = int(input())
    # pascals_traingle_row(r)

    # Variant 3:
    r = int(input())
    print_matrix(pascals_traingle_whole(r))






