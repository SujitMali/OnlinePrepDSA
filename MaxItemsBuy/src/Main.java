//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int arr[] = new int[]
////                {
////
////                500, 100, 100, 100, 100, 100
////        };
//
//                {300, 300};
//        Arrays.sort(arr);
//        int itemCount = 0;
//        int maxLimit = 500;
//        int total = 0;
//        System.out.println(Arrays.toString(arr));
//        for(int i = 0 ; i < arr.length ; i++)
//        {
//            if(arr[i] + total <= maxLimit)
//            {
//
//                total = total + arr[i];
//                itemCount++;
//            }
//        }
//        System.out.println("Max Items that can be Bought is : " + itemCount);
//    }
//}
public class Main {
    public static void main(String[] args) {

        int[] prices = {1, 300,1,500,250, 300};
        int budget = 500;

        // dp[b] = maximum number of items that can be bought with budget b
        int[] dp = new int[budget + 1];

        for (int price : prices) {
            for (int b = budget; b >= price; b--) {
                dp[b] = Math.max(dp[b], dp[b - price] + 1);
            }
        }

        System.out.println("Max Items that can be Bought is : " + dp[budget]);
    }
}
