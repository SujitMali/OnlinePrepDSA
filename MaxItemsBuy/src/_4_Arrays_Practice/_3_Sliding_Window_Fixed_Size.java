package _4_Arrays_Practice;

public class _3_Sliding_Window_Fixed_Size {
    public static void main(String[] args) {
        //Array is given
//        int[] arr = {2, 1, 5, 1, 3, 2};

        //Fixed Window Size is given already.
//        int k = 3;

        //We need to simply find the Max-Sum.
        //Max-sum but condition is that
        //1. The subarrays should be continougous/Continous and not in parts.
        //2. Subarray should be in that window which is fixed of size 3.

        //Here think of that window, that whatever will be inside it.
        //Need to have the greatest possible sum that this given array can have with size of 3.
//
//        int start = 0;
//        int maxSum = 0;
//        int windowSum = 0;
//
//        for(int end = 0; end < arr.length; end++) {
//            windowSum += arr[end];
//
//            if (end - start + 1 > k) {
//                windowSum -= arr[start];
//                start++;
//            }
//
//            if (end - start + 1 == k)
//            {
//                maxSum = Math.max(windowSum, maxSum);
//            }
//        }
//        System.out.println("Max sum of size " + k + " = " + maxSum);


        /*  ---------------------------
            ---- Max Average logic ----
            ---------------------------
        */

//        int[] arr = {1, 12, -5, -6, 50, 3};
//        int k = 4;
//
//        int maxSum = Integer.MIN_VALUE;
//        int left = 0;
//        int windowSum =0;
//
//        for(int right = 0; right < arr.length; right++)
//        {
//            windowSum += arr[right];
//            if(right - left + 1 > k)
//            {
//                windowSum -= arr[left];
//                left++;
//            }
//            if(right - left + 1 == k)
//            {
//                maxSum = Math.max(maxSum, windowSum);
//            }
//
//        }
//        System.out.println("Max Avg with Window Size "+ k +" is : " + (double)maxSum/4); int[] arr = {1, 12, -5, -6, 50, 3};
//        int k = 4;
//
//        int maxSum = Integer.MIN_VALUE;
//        int left = 0;
//        int windowSum =0;
//
//        for(int right = 0; right < arr.length; right++)
//        {
//            windowSum += arr[right];
//            if(right - left + 1 > k)
//            {
//                windowSum -= arr[left];
//                left++;
//            }
//            if(right - left + 1 == k)
//            {
//                maxSum = Math.max(maxSum, windowSum);
//            }
//
//        }
//        System.out.println("Max Avg with Window Size "+ k +" is : " + (double)maxSum/4);


        /*  ---------------------------
            ---- Max number of 1s ----
            ---------------------------
        */
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 1};
        int k = 3;

        int left = 0;
        /*
            One variable tracks the window state,
            another tracks the best answer seen.
        */
        int maxCount = 0;
        int windowCount = 0;

        for(int right = 0; right < arr.length ; right++)
        {
            if(arr[right] == 1)
            {
                windowCount++;
            }

            if(right - left + 1 > k)
            {
                if(arr[left] == 1)
                {
                    windowCount--;
                }
                left++;
            }

            if(right - left + 1 == k)
            {
                maxCount = Math.max(maxCount, windowCount);
            }
        }
        System.out.println(maxCount);
    }
}
