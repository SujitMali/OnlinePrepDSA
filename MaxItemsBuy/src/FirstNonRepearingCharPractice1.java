import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepearingCharPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        HashMap<Character, Integer> hashmap = new HashMap<>();

        for(char c : s.toCharArray())
        {
            hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
        }
        boolean found = false;
        for(int i = 0 ; i < s.length(); i++)
        {
            if(hashmap.get(s.charAt(i)) == 1)
            {
                System.out.println(s.charAt(i));
                found = true;
                break;
            }

        }
        if(!found)
        {
            System.out.println("-1");
        }

    }
}
