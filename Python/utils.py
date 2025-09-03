import time
import sys


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