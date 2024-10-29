package com.bptn.course._28_sorting_algorithm;

public class InsertionSortExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, -1, 7, 10, 2};  // Initialize the array with unsorted values
        insertionSort(arr);  // Call the insertionSort method to sort the array
        
        System.out.print("Sorted array: ");  // Print the header for the sorted array
        for (int num : arr) {  // Loop through each element in the sorted array
            System.out.print(num + " ");  // Print each element followed by a space
        }
    }

    static void insertionSort(int[] arr) {
        int n = arr.length;  // Get the length of the array
        
        for (int i = 1; i < n; i++) {  // Start from the second element and loop through the array
            int key = arr[i];  // Store the current element as the key
            int j = i - 1;  // Initialize j to the last index of the sorted part
            
            while (j >= 0 && arr[j] > key) {  // Move elements greater than key one position ahead
                arr[j + 1] = arr[j];  // Shift the larger element to the right
                j--;  // Move to the next element on the left
            }
            arr[j + 1] = key;  // Insert the key at the correct position in the sorted part
        }
    }
}
