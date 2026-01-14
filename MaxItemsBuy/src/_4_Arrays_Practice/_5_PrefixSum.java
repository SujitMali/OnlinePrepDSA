package _4_Arrays_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class _5_PrefixSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int size = arr.length;

        int prefixSumArray[] = new int[arr.length];
        System.out.println("Actual array is : ");
        System.out.println(Arrays.toString(arr));


        for(int i= 0 ; i < size; i ++)
        {
            System.out.print(" ^ ");
        }
        System.out.println();
        for(int i= 0 ; i < size; i ++)
        {
            System.out.print(" "+i+" ");
        }

        for(int i = 0; i < arr.length ; i++){
            if(i == 0){
                prefixSumArray[i] = arr[i];
            }else
            {
                prefixSumArray[i] = arr[i] + prefixSumArray[i-1];
            }
        }

        Scanner scan = new Scanner(System.in);

        System.out.print("\nEnter Start index : ");
        int startIndex = scan.nextInt();

        System.out.print("Enter End index : ");
        int endIndex = scan.nextInt();

        System.out.print("Getting you Sum from : "+startIndex+ " to " + endIndex+ " ..... ");
        int prefixSum;
        if(startIndex == 0)
        {
            prefixSum = prefixSumArray[endIndex];
        }
        else{
            prefixSum= prefixSumArray[endIndex] - prefixSumArray[startIndex - 1];
        }
        System.out.print(prefixSum);
    }
}
