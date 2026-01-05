package Final_Dsa_Prep_For_OA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class LeaderInArrayPractice {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; i++)
        {
            arr[i] = sc.nextInt();
        }

        List<Integer> leadersArray = new ArrayList<>();
        leadersArray.add(arr[N-1]);
        int currentMax = arr[N-1];

        for(int i = N-2; i>= 0; i--)
        {
            if(currentMax < arr[i])
            {
                currentMax = arr[i];
                leadersArray.add(currentMax);
            }
        }

        Collections.reverse(leadersArray);

        System.out.println(leadersArray);

    }
}
