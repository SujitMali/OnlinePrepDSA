package Final_Dsa_Prep_For_OA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Min_Max_VacationPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] workingDays = new int[n];
        for(int i = 0; i < n; i++)
        {
            workingDays[i] = s.nextInt();
        }

        Arrays.sort(workingDays);

        int maxVacation = 0;
        for(int i = 1; i<n;i++)
        {
            int diff = workingDays[i] - workingDays[i-1] - 1;
            if(diff > maxVacation)
            {
                maxVacation = diff;
            }
        }
        System.out.println(maxVacation);
    }
}
