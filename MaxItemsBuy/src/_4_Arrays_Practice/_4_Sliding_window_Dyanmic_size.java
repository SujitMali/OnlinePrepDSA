package _4_Arrays_Practice;

public class _4_Sliding_window_Dyanmic_size {

    // Program starts here
    public static void main(String[] args) {

        //Print All subarrays by brute force approach !
        //int[] arr = {1, 2, 3};

        //For Dynamic Window Practice Problem
        //Here we are finding the Length of the Maximum Subarray !
        //int[] arr = {0,1,0,1,0,1,0};
        //int k = 1;
        //System.out.println(findLongestSubarrayLength(arr, k));

        //For Dynamic Window Practice Problem
        //Here we are returning the actual Subarray!
        int[] arr = {0,1,0,1,0,1,0};
        int k = 1;
        int[] best = findLongestSubarray(arr, k);
        for (int x : best) {
            System.out.print(x + " ");
        }

    }





     /*
        Here we will be returning the entire array !
     */
    public static int[] findLongestSubarray(int arr[], int k){
        int left = 0;
        int zeroCount = 0;
        int bestStart = 0;
        int bestLength = 0;

        for(int right = 0; right < arr.length; right++)
        {
            if(arr[right] == 0)
            {
                zeroCount++;
            }
            while(zeroCount > k){
                if(arr[left] == 0)
                {
                    zeroCount--;
                }
                left++;
            }

            int windowLength = right - left + 1;
            if(windowLength > bestLength)
            {
                bestLength = windowLength;
                bestStart = left;
            }
        }

        int[] result = new int[bestLength];
        for(int i = 0; i < bestLength; i++){
            result[i] = arr[bestStart + i];
        }

        return result;
    }



    /*
    ------------------------------------------------------------------
    ---------------- Dynamic Window Practice Problem -----------------
    ------------------------------------------------------------------
    You are given a binary array (only 0 and 1) and an integer K.
    Task:
        Find the length of the longest subarray that contains at most K zeros.
     */
    public static int findLongestSubarrayLength(int[] arr, int k)
    {
        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;
        for(int right  = 0; right < arr.length; right++)
        {
            if(arr[right] == 0)
            {
                zeroCount++;
            }

            if(zeroCount > k)
            {
                if(arr[left] == 0)
                {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1 );

        }

        return maxLength;
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
