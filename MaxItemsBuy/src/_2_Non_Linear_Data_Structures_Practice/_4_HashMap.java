package _2_Non_Linear_Data_Structures_Practice;

import java.util.HashMap;
import java.util.HashSet;

public class _4_HashMap {
    public static void main(String[] args) {
        //===================================
        //Frequency Counter using HashMap
//        //===================================
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        String[] words = {"apple", "banana", "apple", "orange"};
//        for(String s : words)
//        {
//            hashMap.put(s, hashMap.getOrDefault(s, 0) + 1);
//
//        }
//        //For Keys it simply replaces the value for it instead of rejecting the insertion.
//        hashMap.put("apple", 6);
//        System.out.println(hashMap);
//        System.out.println(hashMap.getOrDefault("thirty", 23) + 1);
//        System.out.println(hashMap);
        //===============  END  ================


        //==============================================
        //==============  Two Sum ======================
        //==============================================
//        int[] arr = { 2 ,7, 11, 15};
//        int target = 15;
//
//        HashMap<Integer, Integer> seen = new HashMap<>();
//        for(int i = 0 ; i< arr.length; i++)
//        {
//            int current = arr[i];
//            int complement = target - current;
//            if (seen.containsKey(complement))
//            {
//                System.out.println("The two number are : " + complement + " with index " + seen.get(complement));
//                System.out.println("The two number are : " + current + " with index " + i);
//                break;
//            }
//            seen.put(current, i);
//        }
        //===============  END  ================

        //==============================================
        //==============  Duplicate Destroyer ==========
        //==============================================

        HashSet<Integer> set = new HashSet<>();
        int[] nums = {1, 3, 5, 7, 1};
        for(int i : nums)
        {
            if(set.contains(i))
            {
                System.out.println("Duplicate Found : " + i);
                break;
            }
            set.add(i);
        }
        //===================  END  ====================
    }
}
