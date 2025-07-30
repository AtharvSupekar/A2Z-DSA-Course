''' 
    TC = O(N+M)
    SC = O(N+M) - for array union
'''

from typing import List

# Function to find the union of two sorted arrays (using the two-pointer approach)
def Union(arr1: List[int], arr2: List[int]) -> List[int]:
    n1, n2 = len(arr1), len(arr2) # Get lengths of both input arrays
    i, j = 0, 0                   # Initialize pointers for arr1 and arr2, respectively
    union = []                    # List to store the unique elements of the union

    # Main merge loop: continues as long as both pointers are within their array limits
    while i < n1 and j < n2:
        # Compare current elements from both arrays
        if arr1[i] <= arr2[j]:
            # Add arr1[i] to union only if it's the first element (union is empty)
            # OR if it's different from the last element already added (to handle duplicates)
            if not union or union[-1] != arr1[i]: # Pythonic check for empty list and last element
                union.append(arr1[i])
            i += 1 # Always move arr1's pointer forward
        else: # arr2[j] is smaller
            # Add arr2[j] to union based on the same duplicate check logic
            if not union or union[-1] != arr2[j]:
                union.append(arr2[j])
            j += 1 # Always move arr2's pointer forward

    # Handle remaining elements in arr1 (if any are left after the main loop)
    while i < n1:
        # Add to union only if not a duplicate of the last added element
        if not union or union[-1] != arr1[i]:
            union.append(arr1[i])
        i += 1

    # Handle remaining elements in arr2 (if any are left after the main loop)
    while j < n2:
        # Add to union only if not a duplicate of the last added element
        if not union or union[-1] != arr2[j]:
            union.append(arr2[j])
        j += 1

    return union # Return the final list containing unique elements from both arrays, in sorted order


# Main execution block: Handles input/output for testing
t = int(input()) # Read number of test cases
while t > 0:
    t -= 1
    # Read elements for arr1
    arr1 = list(map(int, input().split()))
    # Read elements for arr2
    arr2 = list(map(int, input().split()))

    # Call the Union function and print the result
    union_result = Union(arr1, arr2)
    print(union_result)