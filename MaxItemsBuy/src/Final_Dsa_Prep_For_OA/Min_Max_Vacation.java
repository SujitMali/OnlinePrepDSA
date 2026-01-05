package Final_Dsa_Prep_For_OA;

import java.util.Arrays;
import java.util.Scanner;

public class Min_Max_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] workingDays = new int[N];

        for(int i = 0; i<N ; i++)
        {
            workingDays[i] = scan.nextInt();
        }
        Arrays.sort(workingDays);

        int currentMaxHoliday = 0;
        for(int i = 1 ; i < workingDays.length ; i++)
        {
                int diff = workingDays[i] - workingDays[i-1] - 1;
                if(diff > currentMaxHoliday)
                {
                    currentMaxHoliday = diff;
                }
        }
        System.out.println(currentMaxHoliday);
    }
}
