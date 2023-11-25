# Merge Sort

> Merge sort is a divide and conquer algorithm that divides the input array into two halves, recursively sorts them, and then merges them back together.

## How does merge sort compare to other sorting algorithm?

> Merge sort is generally slower than other sorting algorithms like quick sort and heapsort, but it is more stable and can handle duplicate values better.

### How does merge sort handle duplicate values?

> Merge sort handles duplicate values by comparing the values in the two halves of the array and merging them back together in a sorted manner.

## Alogrithm

> 1. If the array has only one element or zero elements then it is already sorted, return.
> 2. Divide the array into two halves.
> 3. Recursively sort each half.
> 4. Merge the two halves together while maintaining sort order.
> 5. Repeat steps 2-4 until the entire array is sorted.

## Complexity Analysis

> - Time Complexity: O(n logn)
> - Space Complexity: O(n)
