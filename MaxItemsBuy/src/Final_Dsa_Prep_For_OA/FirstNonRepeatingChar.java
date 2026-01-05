package Final_Dsa_Prep_For_OA;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        HashMap<Character, Integer> charMapper = new HashMap<>();
        String k = sc.next();
        for (int i = 0; i < k.length(); i++) {
            charMapper.put(k.charAt(i), charMapper.getOrDefault(k.charAt(i), 0) + 1);
        }

        boolean found = false;
        for(int i = 0 ; i < k.length(); i++)
        {
            if(charMapper.get(k.charAt(i)) == 1)
            {
                System.out.println(k.charAt(i));
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("-1");
        }


    }

}
