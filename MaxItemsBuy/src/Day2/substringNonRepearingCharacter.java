package Day2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class substringNonRepearingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int maxLen = 0;

        for(int i = 0; i < s.length(); i++) {

            // RESET the set for every new starting point
            Set<Character> hashSet = new HashSet<>();

            // Inner Loop: Pick an ENDING point 'j'
            for(int j = i; j < s.length(); j++) { // Start j from i, not 0

                // If we find a duplicate, this substring is INVALID. Stop.
                if(hashSet.contains(s.charAt(j))) {
                    break;
                }
                else {
                    // Add the character we are currently looking at (j)
                    hashSet.add(s.charAt(j));

                    // Calculate the length of this specific substring (i to j)
                    int currentLength = j - i + 1;

                    // Update global max
                    if(currentLength > maxLen) {
                        maxLen = currentLength;
                    }
                }
            }
        }
        System.out.println(maxLen);
    }
}
