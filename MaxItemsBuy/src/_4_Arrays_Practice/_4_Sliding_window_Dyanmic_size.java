package _4_Arrays_Practice;

public class _4_Sliding_window_Dyanmic_size {

    // Program starts here
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        // Print all possible contiguous subarrays
        printAllSubarrays(arr);
    }

    //Brute Force Way to Create A SubArray
    // This method prints every possible contiguous subarray
    // A subarray is a continuous slice of the original array
    public static void printAllSubarrays(int[] arr) {

        int n = arr.length;

        // The 'start' pointer decides where the subarray begins
        // We move it from left to right
        for (int start = 0; start < n; start++) {

            // The 'end' pointer decides where the subarray ends
            // It always starts from 'start' and moves to the right
            for (int end = start; end < n; end++) {

                // Now we have one window: arr[start] to arr[end]
                // Let's print everything inside this window
                System.out.print("[ ");

                // This loop walks inside the current window
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                // End of one subarray
                System.out.println("]");
            }
        }
    }

}
