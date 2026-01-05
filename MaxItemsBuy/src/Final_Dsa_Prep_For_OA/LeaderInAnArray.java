package Final_Dsa_Prep_For_OA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeaderInAnArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }

        List<Integer> leadersArray = new ArrayList<>();

        // Rightmost element is always a leader
        int currentMax = arr[N - 1];
        leadersArray.add(currentMax);

        // Traverse from right to left
        for (int i = N - 2; i >= 0; i--) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
                leadersArray.add(currentMax);
            }
        }

        // Reverse to print left-to-right
        Collections.reverse(leadersArray);

        // Print as required
        for (int x : leadersArray) {
            System.out.print(x + " ");
        }
    }
}
