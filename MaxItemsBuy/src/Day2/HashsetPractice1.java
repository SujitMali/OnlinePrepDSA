package Day2;

import java.util.Set;

import java.util.HashSet;

public class HashsetPractice1 {
    public static void main(String[] args) {
        String s = "banana";

        Set<Character> hashSet = new HashSet<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(!hashSet.contains(s.charAt(i)))
            {
                hashSet.add(s.charAt(i));
            }
        }
        System.out.println(hashSet);

        //Sliding Window
        String buffer = "abc";

        for(int i = 0 ; i < buffer.length(); i++)
        {
            StringBuilder subPrinter = new StringBuilder();
            for(int j = i ; j < buffer.length() ; j++)
            {
                subPrinter.append(buffer.charAt(j));
                System.out.println(subPrinter);
            }
        }

        //Combined Drill
        String mose = "pwwkew";

        int leftPointer = 0;
        int rightPointer = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        while(rightPointer < mose.length())
        {
            if(!set.contains(mose.charAt(rightPointer)))
            {
                set.add(mose.charAt(rightPointer));
                rightPointer++;
                maxLen = Math.max(maxLen , set.size());
            }
            else
            {
                set.remove(mose.charAt(leftPointer));
                leftPointer++;
            }
            System.out.println("Window : " + set);

        }
        System.out.println(maxLen);
    }
}
