import time
import sys
from typing import List

def timer(func):
    """A decorator that prints the time a function takes to execute."""

    def wrapper(*args, **kwargs):
        start_time = time.time()
        result = func(*args, **kwargs)
        end_time = time.time()

        print(f"--- Timing for '{func.__name__}' ---")
        print(f"Runtime: {end_time - start_time:.6f} seconds")
        print(f"Result: {result}\n")
        return result

    return wrapper

def print_matrix(matrix: List[List[int]]) -> None:
    """
    Prints a 2D matrix in a well-structured format.
    """
    if not matrix or not matrix[0]:
        print("[]")
        return

    # Find the maximum width of a number for alignment
    max_width = 0
    for row in matrix:
        for element in row:
            max_width = max(max_width, len(str(element)))

    for row in matrix:
        print('[', end='')
        for i, element in enumerate(row):
            # Use string formatting to align elements
            print(f'{element:>{max_width}}', end='')
            if i < len(row) - 1:
                print(', ', end='')
        print(']')
    print()