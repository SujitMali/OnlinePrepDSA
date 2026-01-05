package _1_Linear_Data_Structure_Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _2_Array {
    public static void main(String[] args) {

        // 1D Array
        int[] oneDArray = new int[]{
            32,23,42,12,53
        };
        System.out.println(Arrays.toString(oneDArray));

        //2D Array
        int[][] twoDArray = new int[][]{
            {34,23,43},
            {32,65,76},
            {12,89,76}
        };
        System.out.println(Arrays.deepToString(twoDArray));

        //Instantly sorts data from smallest to largest. This uses Dual-Pivot Quicksort (very fast, O(N log N)).
        int[] arr = {5, 1, 9, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //If you want Descending order (9, 5, 3, 1),
        // you cannot use int[]. You must use Integer[] (Wrapper Class) and pass Collections.reverseOrder().
        Integer[] reverseArr = new Integer[]{32,54,65,23,8};
        Arrays.sort(reverseArr);
        System.out.println(Arrays.toString(reverseArr));

        //To create exact copy of that array
        int[] original = {1, 2, 3};
        int[] firstCopy = Arrays.copyOf(original, original.length);
        //To create exact copy of that array in certain range.
        int[] part = Arrays.copyOfRange(original, 1, 3);

        //To compare the Contents of the array.
        System.out.println(Arrays.equals(original, arr));


        int[][] a = {{1,2},{3,4}};
        int[][] b = {{1,2},{3,4}};
        //To compare the Contents of the 2D-array.
        System.out.println(Arrays.deepEquals(a, b));



        // ==========================================
        // SCENARIO 1: String Array -> ArrayList
        // (The "Wrapper" Trick)
        // ==========================================
        System.out.println("--- 1. String Array to ArrayList ---");

        // Step A: We have array
        String[] fixedArray = {"Apple", "Banana", "Cherry"};

        // Step B: Convert to ArrayList
        // Arrays.asList(...) wraps the array.
        // new ArrayList<>(...) creates a NEW flexible list so we can add more items.
        ArrayList<String> flexibleList = new ArrayList<>(Arrays.asList(fixedArray));

        // Proof: We can now add a new item! (Impossible with a normal array)
        flexibleList.add("Mango");

        System.out.println("Result: " + flexibleList);


        // ==========================================
        // SCENARIO 2: int Array -> ArrayList
        // (The "Loop" Method - Primitives are special)
        // ==========================================
        System.out.println("\n--- 2. int Array to ArrayList ---");

        // Step A: We have a primitive int array
        int[] numbers = {10, 20, 30};

        // Step B: Create an empty 'Integer' list
        // Note: We cannot use 'int' here, must use the wrapper 'Integer'
        ArrayList<Integer> numberList = new ArrayList<>();

        // Step C: The Loop
        // Arrays.asList() fails for int[], so we just copy them manually.
        // It is simple and 100% reliable.
        for (int num : numbers) {
            numberList.add(num);
        }

        numberList.add(40); // Adding new number
        System.out.println("Result: " + numberList);


        // ==========================================
        // SCENARIO 3: ArrayList -> String Array
        // (The "Pack Up" Method)
        // ==========================================
        System.out.println("\n--- 3. ArrayList back to Array ---");

        // Step A: We have a list
        ArrayList<String> myColors = new ArrayList<>();
        myColors.add("Red");
        myColors.add("Blue");

        // Step B: Convert back to Array
        // .toArray() needs a template to know the Type.
        // new String[0] is just an empty dummy array to tell Java: "Make a String array please"
        String[] colorArray = myColors.toArray(new String[0]);

        System.out.println("Result Array: " + Arrays.toString(colorArray));



        // ==========================================
        // TYPE 2: PRIMITIVE int (int[])
        // Method: Manual Loop (Safest) or Streams
        // Problem: ArrayList holds 'Integer', but we want 'int'.
        // ==========================================
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(20);

        // We CANNOT do: intList.toArray(new int[0]); // Compile Error!

        // Solution: Create array of size list.size() and fill it manually.
        int[] intArr = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            intArr[i] = intList.get(i); // Auto-unboxing (Integer -> int)
        }
        System.out.println("int Array: " + Arrays.toString(intArr));

    }
}
