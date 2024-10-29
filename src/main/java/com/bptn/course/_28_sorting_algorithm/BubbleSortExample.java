package com.bptn.course._28_sorting_algorithm;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 7, 10, 2};  // Initialize the array with unsorted values
        bubbleSort(arr);  // Call the bubbleSort method to sort the array
        
        System.out.print("Sorted array: ");  // Print the header for the sorted array
        for (int num : arr) {  // Loop through each element in the sorted array
            System.out.print(num + " ");  // Print each element followed by a space
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;  // Get the length of the array
        
        for (int i = 0; i < n; i++) {  // Outer loop for each pass through the array
            boolean swapped = false;  // A flag to detect if any swapping happened in this pass
            
            for (int j = 0; j < n - i - 1; j++) {  // Inner loop for comparing adjacent elements
                if (arr[j] > arr[j + 1]) {  // Compare the current element with the next element
                    int temp = arr[j];  // Step 1: Store arr[j] in a temporary variable
                    arr[j] = arr[j + 1];  // Step 2: Assign arr[j + 1] to arr[j]
                    arr[j + 1] = temp;  // Step 3: Assign the value in temp to arr[j + 1]
                    swapped = true;  // Set the flag to true to indicate a swap occurred
                }
            }
            
            if (!swapped) {  // If no swaps occurred during this pass
                break;  // Exit the loop early as no swaps means the array is sorted
            }
        }
    }
}
